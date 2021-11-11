package com.pro.test;

import com.pro.entity.Student;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class testXpath{
    @Test
    public void testXpath() throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/main/java/com/pro/test/xml/stundents.xml");
        //我们使用selectNodes或selectSingleNode
        //查询id为2的学生
        Element stuEle = (Element) document.selectSingleNode("students/student[@id='2']");
        //获取学生的信息
        String idStr = stuEle.attributeValue("id");
        String name = stuEle.elementText("name");
        String ageStr = stuEle.elementText("age");
        String gender = stuEle.elementText("gender");
        String address = stuEle.elementText("address");

        //封装为一个学生对象
        Student stu = new Student(Integer.parseInt(idStr), name, Integer.parseInt(ageStr), gender, address);
        System.out.println(stu);
    }
}

