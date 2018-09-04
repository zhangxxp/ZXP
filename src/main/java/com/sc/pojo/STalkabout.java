package com.sc.pojo;

import java.io.Serializable;
import java.util.Date;

public class STalkabout implements Serializable {
    private Integer id;

    private Integer studentsid;

    private Integer classid;

    private Date timeing;

    private String talkcontent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(Integer studentsid) {
        this.studentsid = studentsid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Date getTimeing() {
        return timeing;
    }

    public void setTimeing(Date timeing) {
        this.timeing = timeing;
    }

    public String getTalkcontent() {
        return talkcontent;
    }

    public void setTalkcontent(String talkcontent) {
        this.talkcontent = talkcontent == null ? null : talkcontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentsid=").append(studentsid);
        sb.append(", classid=").append(classid);
        sb.append(", timeing=").append(timeing);
        sb.append(", talkcontent=").append(talkcontent);
        sb.append("]");
        return sb.toString();
    }
}