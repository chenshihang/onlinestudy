package org.wingstudio.entity;

public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}