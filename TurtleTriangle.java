package com.sd.turtle;
import ch.aplu.turtle.*;

class TurtleTriangle {
Turtle t1 = new Turtle();
TurtleTriangle(){
for(int i=0; i<3; i++)
{
t1.forward(100);
t1.right(120);
}
}
public static void main(String[] args)
{
new TurtleTriangle();
}
}

