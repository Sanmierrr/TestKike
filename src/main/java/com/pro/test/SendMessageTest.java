package com.pro.test;

import org.apache.poi.ss.usermodel.Header;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class SendMessageTest {

    @Test
    public void sendMessageTest(){

        URL url = null;
        HttpURLConnection conn = null;
        OutputStream outStream = null;
        InputStream inStream = null;
        try {
            url = new URL("http://219.233.89.7:8090/cgi-bin/mailinterface");
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);

            String sendXml = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><!DOCTYPE SigMailCommand SYSTEM \"SigMail.dtd\">"; //XML数据
            sendXml += "<SigMailCommand Name=\"checkuser\"><Param Name=\"domainname\">test.com.cn</Param>";
            sendXml += "<Param Name=\"username\">admin</Param></SigMailCommand>";
            outStream = conn.getOutputStream();

            //准备通过CONN对象写入XML数据
            BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(outStream,"UTF-16"));
            bw.write(sendXml);
            bw.flush();
            bw.close();

            //准备通过CONN对象读取返回的XML数据

            inStream = conn.getInputStream();
            StringBuffer returnXml = new StringBuffer("");
            BufferedReader rd = new BufferedReader(new InputStreamReader(inStream,"UTF-16"));
            for (String line = null; (line = rd.readLine()) != null;) {
                returnXml.append(line);
            }
            System.out.println(returnXml.toString());
            rd.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if (outStream != null){
                    outStream.close();
                }
                if (inStream != null){
                    inStream.close();
                }
                if (conn != null){
                    conn.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
