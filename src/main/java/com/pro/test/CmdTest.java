package com.pro.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Java 调用系统命令
 * 通过 java.lang.Runtime 类用操作系统命令
 * 然后调用run.exec()进程来执行命令程序
 *  cmd /c dir 是执行完dir命令后结束程序。
 *  cmd /k dir 是执行完dir命令后不结束程序。
 *  cmd /c start dir 会打开一个新窗口后执行dir指令，原程序结束。
 *  cmd /k start dir 会打开一个新窗口后执行dir指令，原程序不结束。 
 *  可用cmd /k start cmd /? 查看系统帮助
 *  说白了 加 start 就是打开命令窗口操作  不加start 就是在控制台查看
 *
 */
public class CmdTest {
   public static void main(String[] args)  {
	String cmd = "ping 127.0.0.1";

	   String property = System.getProperty("user.dir");
	   System.out.println(property);
	   System.out.println(executeLinuxCmd(cmd));
   }

	public static String executeLinuxCmd(String cmd) {
		System.out.println("执行命令[ " + cmd + "]");
		Runtime run = Runtime.getRuntime();
		try {
			Process process = run.exec(cmd);
			String line;
			BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(process.getInputStream(),Charset.forName("GBK")));
			StringBuffer out = new StringBuffer();
			while ((line = stdoutReader.readLine()) != null ) {
				out.append(line + "\r\n");
			}
			try {
				process.waitFor();
				System.out.println(process.waitFor());
				System.out.println(process.exitValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			process.destroy();
			return out.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

