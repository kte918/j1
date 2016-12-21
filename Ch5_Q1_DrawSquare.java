import ch.aplu.turtle.*;

class Ch5_Q1_DrawSquare{
 
   Turtle t1=new Turtle();
   int size;
   public void drawSquare(int size){
       for(int i=0; i<4;i++)
	   {
           t1.forward(size);
           t1.right(90);
	   }	   
   }
   public static void main(String[]args){
   Ch5_Q1_DrawSquare d = new Ch5_Q1_DrawSquare();
   d.drawSquare(100);
   }
}