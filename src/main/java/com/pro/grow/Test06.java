package com.pro.grow;

public class Test06 {
	public static void main(String[] args) {
		Base b = new Sub();
		//1
		System.out.println(b.x);
	}
}
class Base{
	int x = 1;
}
class Sub extends Base{
	int x = 2;
}
