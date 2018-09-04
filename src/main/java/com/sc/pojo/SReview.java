package com.sc.pojo;

import java.io.Serializable;
import java.util.Date;

public class SReview implements Serializable {
    private Integer id;

    private String revname;

    private Integer classid;

    private Date revtime;

    private Integer tid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRevname() {
        return revname;
    }

    public void setRevname(String revname) {
        this.revname = revname == null ? null : revname.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Date getRevtime() {
        return revtime;
    }

    public void setRevtime(Date revtime) {
        this.revtime = revtime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", revname=").append(revname);
        sb.append(", classid=").append(classid);
        sb.append(", revtime=").append(revtime);
        sb.append(", tid=").append(tid);
        sb.append("]");
        return sb.toString();
    }
}