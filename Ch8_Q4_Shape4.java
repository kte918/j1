abstract class Shape {
    public String name="Shape";
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public String getName() { return this.name; }
    public String toString() {
        return "Shape..."+super.toString();
    }
}
class Rectangle extends Shape {
    private final double width, height, area, perimeter;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height= height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }
    public double calcArea() {
        return this.area;
    }
    public double calcPerimeter() {
        return this.perimeter;
    }
    public String toString() {
        return "Rectangle..."+super.toString();
    }
}
class Circle extends Shape {
    private final double radius, area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius;
    }
    public double calcArea() {
        return this.area;
    }
    public double calcPerimeter() {
        return this.perimeter;
    }
    public String toString() {
        return "Circle..."+super.toString();
    }
}
public class Ch8_Q4_Shape4 {
	public static void main(String[] args)
	{
	Circle c = new Circle(5);
	Rectangle r = new Rectangle(10,5);
	String cName = c.toString();
	double cArea = c.calcArea();
	double cPeri = c.calcPerimeter();
	System.out.println(cName+ "  area is "+cArea+"  Perimeter is "+cPeri);
	
	String rName = r.toString();
	double rArea = r.calcArea();
	double rPeri = r.calcPerimeter();
	System.out.println(rName+ "  area is "+rArea+"  Perimeter is "+rPeri);
	
	}
}