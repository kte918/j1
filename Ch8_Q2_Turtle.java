class Turtle {
    protected int nLimbs=4;
    protected String food;
    public void setFood(String f) {
        this.food=f;
    }
    public void eat() {
        System.out.println("Turtle eats "+food);
    }   
}
class SeaTurtle extends Turtle {
    public void swim() {
        System.out.println("A sea turtle can swims... and has "+nLimbs+ "limbs");
    }
}
class LandTurtle extends Turtle {
    public void walk() {
        System.out.println("A land turtle can walks... and has "+nLimbs+ "limbs");
    }
}
public class Ch8_Q2_Turtle{
public static void main(String[] args){
	Turtle t = new Turtle();
	SeaTurtle s = new SeaTurtle();
	LandTurtle l = new LandTurtle();
	s.setFood("seaweeds");
	l.setFood("plant");
	s.eat();
	s.swim();
	l.eat();
	l.walk();
}
}