package com.xz.pojo;

import java.io.Serializable;

/**
 * (TMenu)实体类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public class TMenu implements Serializable {
    private static final long serialVersionUID = 871622042005469742L;
    /**
     * 菜单id
     */
    private Integer id;
    /**
     * 菜单名
     */
    private String name;
    /**
     * 链接页面
     */
    private String url;
    /**
     * 父菜单id
     */
    private Integer parentId;
    /**
     * 菜单排序
     */
    private Integer sort;
    
    private String icon;
    
    private String perms;
    /**
     * 菜单类型
     */
    private Integer type;


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
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", parentId=" + parentId +
                ", sort=" + sort +
                ", icon='" + icon + '\'' +
                ", perms='" + perms + '\'' +
                ", type=" + type +
                '}';
    }
}

