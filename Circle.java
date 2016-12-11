import java.util.Scanner;

public class Circle {
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas input your radius");
		double r = sc.nextInt();
		double pi = (double)Math.PI;
		System.out.println("Result is " + r*r*pi);
		}
	public static void main(String[] args){
	Circle c = new Circle();
	}
}