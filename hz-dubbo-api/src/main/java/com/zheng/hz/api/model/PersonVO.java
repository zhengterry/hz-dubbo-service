package com.zheng.hz.api.model;

import java.io.Serializable;

/**
 * Created by hz on 2016/11/13/013.
 */
public class PersonVO implements Serializable{
    private Long id;
    private String name;
    private String iphone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }
}
