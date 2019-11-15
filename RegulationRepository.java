package com.saieye.htsz.repository.second;

import com.saieye.htsz.domain.second.Regulation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegulationRepository extends GraphRepository<Regulation> {


    @Query("match(n:HT_combine_NLP)-[r]-(p:HTNLP)return n,r,p")
    List<Regulation> findAll();

    @Query("match(n:HTGLBF)-[r]-(p:HT_combine_NLP)return n,r,p")
    List<Regulation> selectAll();

    @Query("match(n:`风险投资审查项`)-[r]-(p:`风险`)return n,r,p")
    List<Regulation> findRiskAll();
}
