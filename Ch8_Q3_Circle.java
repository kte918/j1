class Point {
    private int x;
    private int y;
    public Point(int xnew, int ynew) {
        this.x=xnew;
        this.y=ynew;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String toString() {
        String msg="("+x+","+y+")";
        return msg;
    }
}
class Ch8_Q3_Circle extends Point {
    private double radius;
    public Ch8_Q3_Circle(int xnew, int ynew, double rnew) {
        super(xnew, ynew);
        this.radius=rnew;
    }
    public double getRadius() {
        return radius;
    }
    public double getCircumference() {
        return 2*Math.PI*getRadius();
    }
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }
	
	public static void main(String[] args){
	Ch8_Q3_Circle c = new Ch8_Q3_Circle(10,10,5);
	double radius = c.getRadius();
	double circumference = c.getCircumference();
	double area = c.getArea();
	System.out.println("radius is "+radius);
	System.out.println("circumference is "+circumference);
	System.out.println("area is "+area);
	}
}