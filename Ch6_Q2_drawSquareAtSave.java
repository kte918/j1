import ch.aplu.turtle.*;
import java.util.ArrayList;

public class Ch6_Q2_drawSquareAtSave{
Turtle t1 = new Turtle();
Double[] pos = new Double[2];
ArrayList<Double[]> posArr = new ArrayList<Double[]>(); 
public void drawSquareAtSave(){
    for(int i=0;i<4;i++){
      pos[0]=t1.getX();
      pos[1]=t1.getY();
      posArr.add(pos);
      System.out.printf("(%.1f,%.1f)\n",pos[0],pos[1]);
      t1.forward(100);
      t1.right(90);
	}
}
public static void main(String[] args){
	Ch6_Q2_drawSquareAtSave d = new Ch6_Q2_drawSquareAtSave();
    d.drawSquareAtSave(); 
}
}