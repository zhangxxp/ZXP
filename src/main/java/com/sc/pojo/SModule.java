package com.sc.pojo;

import java.io.Serializable;

public class SModule implements Serializable {
    private Integer id;

    private String modname;

    private String url;

    private Short modstate;

    private Short fatherid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModname() {
        return modname;
    }

    public void setModname(String modname) {
        this.modname = modname == null ? null : modname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Short getModstate() {
        return modstate;
    }

    public void setModstate(Short modstate) {
        this.modstate = modstate;
    }

    public Short getFatherid() {
        return fatherid;
    }

    public void setFatherid(Short fatherid) {
        this.fatherid = fatherid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modname=").append(modname);
        sb.append(", url=").append(url);
        sb.append(", modstate=").append(modstate);
        sb.append(", fatherid=").append(fatherid);
        sb.append("]");
        return sb.toString();
    }
}