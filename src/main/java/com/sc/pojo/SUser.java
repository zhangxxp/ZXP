package com.sc.pojo;

import java.io.Serializable;
import java.util.Date;

public class SUser implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Short qq;

    private Short phone;

    private String sex;

    private String email;

    private Short state;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Short getQq() {
        return qq;
    }

    public void setQq(Short qq) {
        this.qq = qq;
    }

    public Short getPhone() {
        return phone;
    }

    public void setPhone(Short phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", qq=").append(qq);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", state=").append(state);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}