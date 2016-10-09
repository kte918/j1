class DiceGame {
Player p1;
Player p2;

public void startGame()
{
p1 = new Player("KGH");
p2 = new Player("KTH");
p1.play();
p2.play();

if (p1.getNum() > p2.getNum())
{
System.out.println(p1.getName() + " is win");
}
else if (p1.getNum() == p2.getNum())
{
System.out.println("Both of people are Draw");
}
else 
{
System.out.println(p2.getName() + " is win");
}
}
}