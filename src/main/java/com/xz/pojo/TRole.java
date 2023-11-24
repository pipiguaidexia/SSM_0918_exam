package com.xz.pojo;

import java.io.Serializable;

/**
 * (TRole)实体类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public class TRole implements Serializable {
    private static final long serialVersionUID = 372056814589694589L;
    
    private Integer id;
    
    private String name;
    
    private String remark;
    
    private Integer status;


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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}

