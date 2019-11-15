package com.saieye.htsz.domain.second;


import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by zj on 2018/1/3.
 */
@RelationshipEntity(type = "Relation")
public class NodeToNodeRel {
    @StartNode
    Htglbf startNode;
    @EndNode
    Htglbf endNode;

    public Htglbf getStartNode() {
        return startNode;
    }

    public void setStartNode(Htglbf startNode) {
        this.startNode = startNode;
    }

    public Htglbf getEndNode() {
        return endNode;
    }

    public void setEndNode(Htglbf endNode) {
        this.endNode = endNode;
    }
}
