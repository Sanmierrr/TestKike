package com.pro.grow;

public class Test05 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		//(1) A and A
		System.out.println("(1)" + a1.show(b));
		//(2) B and A
		System.out.println("(2)" + a2.show(d));
		//(3) A and C
		System.out.println("(3)" + b.show(c));
		//(4) B and B
		System.out.println("(4)" + b.show(d));
	}
}

class A {
	public String show(C obj) {
		return ("A and C");
	}

	public String show(A obj) {
		return "A and A";
	}
}

class B extends A {
	public String show(B obj) {
		return "B and B";
	}

	public String show(A obj) {
		return "B and A";
	}
}

class C extends B {

}

class D extends B {

}
