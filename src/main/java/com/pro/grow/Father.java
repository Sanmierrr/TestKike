package com.pro.grow;

public class Father{
	//无法编译  private
	//public  可以
//	private String name = "atguigu";
	public String name = "atguigu";
	int age = 0;
}
//public class Child extends Father{
class Child extends Father{
	public String grade;

	public static void main(String[] args){
		Father f = new Child();
		System.out.println(f.name);
	}
}
