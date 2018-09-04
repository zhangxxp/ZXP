package com.sc.pojo;

import java.io.Serializable;
import java.util.Date;

public class SActivity implements Serializable {
    private Integer id;

    private Integer classid;

    private String actname;

    private String actposition;

    private Date acttime;

    private Integer tid;

    private String pic;

    private String actinfor;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname == null ? null : actname.trim();
    }

    public String getActposition() {
        return actposition;
    }

    public void setActposition(String actposition) {
        this.actposition = actposition == null ? null : actposition.trim();
    }

    public Date getActtime() {
        return acttime;
    }

    public void setActtime(Date acttime) {
        this.acttime = acttime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getActinfor() {
        return actinfor;
    }

    public void setActinfor(String actinfor) {
        this.actinfor = actinfor == null ? null : actinfor.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classid=").append(classid);
        sb.append(", actname=").append(actname);
        sb.append(", actposition=").append(actposition);
        sb.append(", acttime=").append(acttime);
        sb.append(", tid=").append(tid);
        sb.append(", pic=").append(pic);
        sb.append(", actinfor=").append(actinfor);
        sb.append("]");
        return sb.toString();
    }
}