package com.pro.test;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
@Component
@DependsOn("applicationContext")
public class SendReportTest {

    @Autowired
    public ApplicationContext applicationContext;

//    public static String sendPost(String url, String pamare) {
//
//        PrintWriter out = null;
//        BufferedReader in = null;
//        String result = "";
//        try {
//            // 打开和URL之间的连接
//            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//            // 设置通用的请求属性
//            conn.setRequestMethod("POST");
//            conn.setConnectTimeout(4 * 1000);
//            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
//
//            // 发送POST请求必须设置如下两行
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            // 获取URLConnection对象对应的输出流
//            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
//            out.println(pamare);
//            // flush输出流的缓冲
//            out.flush();
//            InputStream is = null;
//            if (conn.getResponseCode() >= 400) {
//
//                is = conn.getErrorStream();
//            } else {
//                is = conn.getInputStream();
//            }
//
//            // 定义BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(new InputStreamReader(is, "utf-8"));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//        } catch (Exception e) {
//            System.out.println("发送 POST 请求出现异常！" + e);
//            e.printStackTrace();
//        }
//        //使用finally块来关闭输出流、输入流
//        finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return result;
//    }
    @Test
    public void returnXml() throws Exception {

        Class clazz = SendReportTest.class;
        String methodName = "returnXml";
        String s = clazz.getSimpleName() + '.' + methodName;
        Object bean = applicationContext.getBean(clazz);
        Method method = clazz.getMethod(methodName);
        method.invoke(bean);


        String xmlInfo = getXmlInfo();
        Document document = null;
        try {
            document = DocumentHelper.parseText(xmlInfo);
            Element root = document.getRootElement();
            Element head = root.element("head");
            System.out.println("-----------" + root.getName());
            String rtnCode = head.element("RtnCode").getTextTrim();
            System.out.println("-----------" + rtnCode);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public String test1(){
        Class clazz = SendReportTest.class;
        String methodName = "returnXml";
        List<String> strings = new ArrayList<>();
        String s = clazz.getSimpleName() + '.' + methodName;
        System.out.println(s);
        return s;
    }

    private String getXmlInfo(){
        StringBuffer sb = new StringBuffer();
        sb.append("<message>");
        sb.append(" <head>");
        sb.append("     <Version>1</Version>");
        sb.append("     <SerialNo>201504171201150001</SerialNo>");
        sb.append("     <ChannelCode>channelCode</ChannelCode>");
        sb.append("     <ServiceName>sendSms2</ServiceName>");
        sb.append("     <TranDate>20150417</TranDate>");
        sb.append("     <TranTime>120115</TranTime>");
        sb.append("     <RtnCode>0000</RtnCode>");
        sb.append("     <RtnMsg>成功</RtnMsg>");
        sb.append(" </head>");
        sb.append("</message>");
        System.out.println(sb.toString());
        return sb.toString();
    }
}
