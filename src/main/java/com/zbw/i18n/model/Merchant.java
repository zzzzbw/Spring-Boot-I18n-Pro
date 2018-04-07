package com.zbw.i18n.model;

import java.util.Date;

/**
 * @author zbw
 * @create 2018/4/3 16:43
 */
public class Merchant {

    private long id;

    private String name;

    private long number;

    private Date create;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
