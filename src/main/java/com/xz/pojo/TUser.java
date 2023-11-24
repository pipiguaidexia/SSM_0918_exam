package com.xz.pojo;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -38699304361773036L;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String account;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 动态盐(用户名md5)
     */
    private String salt;
    /**
     * 用户状态 为   1正常，为0表示停用
     */
    private Integer status;


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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", salt='" + salt + '\'' +
                ", status=" + status +
                '}';
    }
}

