package com.sd.ch8;
import java.util.*;
public class Selection 
{
    ArrayList<Rectangle> Arr = new ArrayList<Rectangle>();
    Selection(){
    }
    public void select(Rectangle r) {
    r.setSelected(true);
 	Arr.add(r);
	System.out.println("selected: "+r.isSelected);
 	}
 	
 	public void print(){
 	for(Rectangle r:Arr)
 	{
 	System.out.println(r.toString());
	}
 	}

 	public static void main(String[] args){
 	Selection s = new Selection();
 	Rectangle r = new Rectangle(20,30);
 	Cube c = new Cube(20,30,50);
 	s.select(c);
 	s.select(r)
 	s.print();
	}
}