package com.sd.turtle;
import ch.aplu.turtle.*;

class TurtleStar {
Turtle t1 = new Turtle();

TurtleStar()
{
for(int i=0;i<5;i++)
{
t1.right(144);
t1.forward(100);
}
}
public static void main(String[] args)
{
new TurtleStar();
}
}
