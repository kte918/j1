class Player {
private int number = 0;
private String name = null;

public Player(String name)
{
this.name = name;
}

public void play()
{
Dice d = new Dice();
d.roll();
this.number = d.getNum();
}

public int getNum()
{
return this.number;
}

public String getName()
{
return this.name;
}
}