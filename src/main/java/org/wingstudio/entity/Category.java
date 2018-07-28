package org.wingstudio.entity;

import java.util.Date;

public class Category {
    private Integer id;

    private String name;

    private Date createTime;

    private String createUser;

    public Category(Integer id, String name, Date createTime, String createUser) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.createUser = createUser;
    }

    public Category() {
        super();
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}