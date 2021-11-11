package com.pro.entity;

import lombok.Data;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
@Data
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String address;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
}
