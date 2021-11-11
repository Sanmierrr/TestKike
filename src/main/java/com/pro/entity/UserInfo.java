package com.pro.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class UserInfo extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String name;

    @ExcelProperty(index = 1)
    private int age;

    @ExcelProperty(index = 2)
    private String address;

}
