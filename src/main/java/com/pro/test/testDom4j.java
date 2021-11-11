package com.pro.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class testDom4j {

    @Test
    public void testDom4j() throws Exception{
        //1、创建解析器对象
        SAXReader reader = new SAXReader();
        //2、使用解析器将xml文件转换成内存中的document对象
        //相对在项目根路径下查找xml文件
        Document document = reader.read("src/main/java/com/pro/test/xml/teachers.xml");
        //3、通过文档对象可以获取文档的根标签
        Element rootElement = document.getRootElement();
        //4、根据根标签获取所有的根标签的子标签合集
        List<Element> elements = rootElement.elements();
        //5、遍历集合中的标签，并将所有的数据解析出来
        for (Element element:elements) {
            //每次遍历就代表一个teacher信息
            System.out.println("正在遍历的标签名：" + element.getName());
            System.out.println("正在遍历标签的id属性值：" + element.attributeValue("id"));
            //获取teacher的子标签的内容
            String tname = element.elementText("tname");
            System.out.println("tname" + tname);
            String tage = element.elementText("tage");
            System.out.println("tage" + tage);

            System.out.println("====================================");
        }

        //添加一个新的student节点
        Element newEle = rootElement.addElement("teacher");
        //创建一个良好的xml格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        //写入文件
        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/main/java/com/pro/test/xml/teachers.xml"), format);
        xmlWriter.write(document);
        xmlWriter.close();
    }
}
