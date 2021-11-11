package com.pro.test;

import com.jcraft.jsch.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/10
 */
public class SSHTest {
    /**
     * 登陆并打开服务器会话
     * @param ip       目标主机名或ip
     */
    private static Session getSession(String ip, String username, String password, Integer port) {
        Session session = null;
        JSch jSch = new JSch();
        try {
            if (port != null) {
                session = jSch.getSession(username, ip, port.intValue());
            } else {
                session = jSch.getSession(username, ip);
            }
            if (password != null) {
                session.setPassword(password);
            }
            //关闭主机密钥检查，否则会导致连接失败
            Properties properties = new Properties();
            properties.setProperty("StrictHostKeyChecking", "no");
            session.setConfig(properties);
            //打开会话，并设置超时时间
            session.connect(30000);
        } catch (JSchException e) {
            e.printStackTrace();
        }
        return session;
    }

    /**
     * 获取sftp连接
     */
    public static ChannelSftp getChannelSftp(Session session) {
        ChannelSftp channel = null;
        try {
            //打开通道，设置通道类型
            channel = (ChannelSftp) session.openChannel("sftp");
            channel.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channel;
    }

    /**
     * 打开exec通道
     */
    public static ChannelExec getChannelExec(Session session) {
        ChannelExec channel = null;
        try {
            //设置通道类型
            channel = (ChannelExec) session.openChannel("exec");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channel;
    }
    /**
     * 示例三：直接获取服务器磁盘使用情况（不读写文件的方式）
     */
    public static List<String> getDiskUsage(String ip, String username, String password, Integer port) {
        List<String> result = new ArrayList<>();
        Session session = getSession(ip, username, password, port);
        ChannelExec channelExec = getChannelExec(session);
        try {
            channelExec.setCommand("ls");
            channelExec.connect();
            InputStream inputStream = channelExec.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            byte[] buf = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (inputStream.read(buf) != -1) {
                sb.append(new String(buf));
            }
            System.out.println(sb.toString());
            result.add(sb.toString());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            channelExec.disconnect();
            session.disconnect();
        }
        return result;
    }

    // 测试
    public static void main(String[] args) {
        List<String> usage = getDiskUsage("192.168.200.128", "root", "123456", 22);
        for (String s : usage) {
            System.out.println(s);
        }
    }
}
