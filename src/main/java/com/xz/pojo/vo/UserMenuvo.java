package com.xz.pojo.vo;

import com.xz.pojo.TMenu;
import com.xz.pojo.TRole;

import java.util.List;

/**
 * @author : [皮皮怪的虾]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/9/22 16:47]
 * @updateUser : [hasee]
 * @updateTime : [2023/9/22 16:47]
 * @updateRemark : [说明本次修改内容]
 */
public class UserMenuvo {
    private Integer id;
    /**
     * 用户名
     */
    private String account;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 用户状态 为   1正常，为0表示停用
     */
    private Integer status;

    private List<TRole> roles;

    private List<TMenu> menus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<TRole> getRoles() {
        return roles;
    }

    public void setRoles(List<TRole> roles) {
        this.roles = roles;
    }

    public List<TMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<TMenu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "UserMenuvo{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", roles=" + roles +
                ", menus=" + menus +
                "}====="+"\n";
    }
}
