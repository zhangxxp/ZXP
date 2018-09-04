package com.sc.pojo;

import java.io.Serializable;

public class SInterview implements Serializable {
    private Integer id;

    private String stime;

    private String scon;

    private String saddress;

    private String sresult;

    private Integer classid;

    private Integer clientid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime == null ? null : stime.trim();
    }

    public String getScon() {
        return scon;
    }

    public void setScon(String scon) {
        this.scon = scon == null ? null : scon.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getSresult() {
        return sresult;
    }

    public void setSresult(String sresult) {
        this.sresult = sresult == null ? null : sresult.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stime=").append(stime);
        sb.append(", scon=").append(scon);
        sb.append(", saddress=").append(saddress);
        sb.append(", sresult=").append(sresult);
        sb.append(", classid=").append(classid);
        sb.append(", clientid=").append(clientid);
        sb.append("]");
        return sb.toString();
    }
}