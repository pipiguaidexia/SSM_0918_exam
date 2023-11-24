package com.xz.pojo;

import java.io.Serializable;

/**
 * (TUserRole)实体类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public class TUserRole implements Serializable {
    private static final long serialVersionUID = -42517365032506403L;
    
    private Integer userId;
    
    private Integer roleId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TUserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}

