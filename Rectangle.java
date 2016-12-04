package com.sd.ch8;

public class Rectangle implements IShape {
	private double width = 0;
	private double height = 0;
	private double area = 0;
	private double perimeter = 0;

	public void Rectangle(double w, double h) {
	this.width = w;
	this.height = h;
	this.area = w*h;
	this.perimeter = 2*(w+h);
	}

	@Override
	public double calcArea() {
	return this.area;
	}
	@Override
	public double calcPerimeter(){
	return this.perimeter;
	}
	public String toString() {
	return "Rectangle...." + super.toString();
	} 
}