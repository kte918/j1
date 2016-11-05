class RSPgame {
String input1 = null;
String input2 = null;

void input1(String a)
{
	input1 = a;
}
void input2(String b)
{
	input2 = b;
}

void Result(){
if(input1 == input2)
{
	System.out.println("Draw");
} else if(input1=="scissor"){
	if(input2=="rock")
	{
	System.out.println("input2(rock) is winner");	
	} else {
    System.out.println("input1(scissor) is winner");
	}
} else if(input1=="rock"){
	if(input2=="scissor")
	{
	System.out.println("input1(rock) is winner");
	} else {
	System.out.println("input2(paper) is winner");
	}
} else if(input1=="paper"){
	if(input2=="scissor")
	{
	System.out.println("input2(scissor) is winner");
	} else {
	System.out.println("input1(paper) is winner");
	}
} else {
	System.out.println("Error");
}
}
}