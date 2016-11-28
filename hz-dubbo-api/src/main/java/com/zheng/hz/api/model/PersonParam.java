package com.zheng.hz.api.model;

import java.io.Serializable;

/**
 * Created by hz on 2016/11/13/013.
 */
public class PersonParam implements Serializable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
