package com.xz.pojo;

import java.io.Serializable;

/**
 * (TRoleMenu)实体类
 *
 * @author makejava
 * @since 2023-09-18 13:52:20
 */
public class TRoleMenu implements Serializable {
    private static final long serialVersionUID = 468789246467023719L;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 菜单名
     */
    private Integer menuId;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "TRoleMenu{" +
                "roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}

