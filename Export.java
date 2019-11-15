package com.saieye.htsz.domain.second;

import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by zj on 2018/2/5.
 */
@QueryResult
public class Export {

    String sn;
    int st;
    String rt;
    String en;
    int et;


    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }



    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public int getEt() {
        return et;
    }

    public void setEt(int et) {
        this.et = et;
    }
}
