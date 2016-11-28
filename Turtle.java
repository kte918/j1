package com.sd.turtle;
public class Turtle {
	int nLimbs = 4;
	protected String food;
	public void setFood(String f){
	food = f;
	}
	public void eat(){
	System.out.println(food);
	}
}

