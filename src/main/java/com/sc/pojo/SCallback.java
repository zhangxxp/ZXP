package com.sc.pojo;

import java.io.Serializable;
import java.util.Date;

public class SCallback implements Serializable {
    private Integer id;

    private SUser susers;

    private String otime;

    private String ctime;

    private String name;

    private String content;

    private Integer clid;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    private static final long serialVersionUID = 1L;

    public SUser getSusers() {
        return susers;
    }

    public void setSusers(SUser susers) {
        this.susers = susers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", otime=").append(otime);
        sb.append(", ctime=").append(ctime);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}