package com.pro.entity;

import lombok.Data;

import java.util.Date;
import java.util.concurrent.Flow;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
@Data
public class Book {
    private String name;
    private Date publishDt;

    public Book() {
    }

    public Book(String name, Date publishDt) {
        this.name = name;
        this.publishDt = publishDt;
    }
}
