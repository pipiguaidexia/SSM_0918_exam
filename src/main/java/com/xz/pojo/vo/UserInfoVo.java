package com.xz.pojo.vo;

import com.xz.pojo.TRole;

import java.util.List;

/**
 * @author : [皮皮怪的虾]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/9/29 10:09]
 * @updateUser : [hasee]
 * @updateTime : [2023/9/29 10:09]
 * @updateRemark : [说明本次修改内容]
 */
public class UserInfoVo {
    private Integer id;

    private String account;

    private String password;

    private String nickname;

    private Integer status;

    private Integer role;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", role=" + role +
                '}';
    }
}
