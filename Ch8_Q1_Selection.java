
class Rectangle{
	protected double length;
	protected double width;
	protected boolean isSelected;
	  
	public Rectangle(double l,double w){
	length=l;
	width=w;
	}
	public double getLength(){
	return this.length;
	}
	public double getWidth(){
	return width;
	}
	public void setSelected(boolean b){
	this.isSelected=b;
	}
	public boolean getSelected(){
	return isSelected;  
	}
}

class Cube{

}

public class Ch8_Q1_Selection {
	public void select(Rectangle r){
		r.setSelected(true);
		System.out.println("selected: "+r.isSelected);
	}
	public static void main(String[] args)
	{
	Ch8_Q1_Selection s=new Ch8_Q1_Selection();
	Rectangle r=new Rectangle(20,30);
	s.select(r);
	r.getSelected();
	}
}
