import ch.aplu.turtle.*; 

public class Ch5_Q2_DrawTurtle {
	public static Turtle t = new Turtle(); 
	public static void main(String[] args)
	{
	Ch5_Q2_DrawTurtle d = new Ch5_Q2_DrawTurtle();
	d.DrawRectangle();
	t.home();
	t.clean();
	d.DrawTriangle();
	t.home();
	t.clean();
	}
	
	public static void DrawRectangle() 
	{		
		for(int i = 0; i<4; i++)
		{
			t.forward(50);
			t.right(90);
		}
	}
	
	public static void DrawTriangle() 
	{
		for(int i = 0; i<3; i++)
		{
			t.forward(50);
			t.right(120);
		}
	}
}