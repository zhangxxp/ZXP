package com.sc.pojo;

import java.io.Serializable;

public class SRole implements Serializable {
    private Integer id;

    private String rolename;

    private Short rolestate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Short getRolestate() {
        return rolestate;
    }

    public void setRolestate(Short rolestate) {
        this.rolestate = rolestate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rolename=").append(rolename);
        sb.append(", rolestate=").append(rolestate);
        sb.append("]");
        return sb.toString();
    }
}