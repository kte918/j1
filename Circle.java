package com.sd.ch8;
import com.sd.ch8;

public class Circle extends Point{
	private double radius = 0;

	Circle(int a, int b, double r){
	x = a;
	y = b;
	radius = r;
	}
	
	public double getArea()
	{
	double area = (radius*radius*3.141592);	
	return area;
	}  
}