package com.sd.ch8;

class Hello {
	private String name;
	public Hello(String name) {
	this.name = name;
	}
	public void sayHello() {
	System.out.println("hello " + name);
	}	
	public static void main(String[] args)
	{
		Hello[] h = new Hello[3];
		h[0] = new Hello("A");
		h[1] = new Hello("B");
		h[2] = new Hello("C");
		for(Hello e : h){
		e.sayHello();
		}
	}
	
}