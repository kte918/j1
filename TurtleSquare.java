package com.sd.turtle;
import ch.aplu.turtle.*;

class TurtleSquare {
Turtle t1 = new Turtle();

TurtleSquare()
{
for(int i = 0; i < 4;i++)
{
t1.forward(100);
t1.right(90);
}
}

public static void main(String[] args)
{
new TurtleSquare();
}
}