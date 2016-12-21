public class Ch5_Q6_ScissorRockPaperGame {
	private int player1 = 0;
	private int player2 = 0;
	
	Ch5_Q6_ScissorRockPaperGame(int input1,int input2){
	player1 = input1;
	player2 = input2;
	}
	
	public void DetermineWinner(){
	if(player1 == player2){
		System.out.println("Draw");
	} else if(player1 == 1) {
		if(player2 == 2){
		System.out.println("player2 is winner and player1 is Loseer");
		}else{
		System.out.println("player1 is winner and player2 is losser");
		}
	} else if(player1 == 2) {
		if(player1 == 1) {
		System.out.println("player1 is winner and player2 is losser");
		}else{
		System.out.println("player2 is winner and player1 is Loseer");
		}
	} else if(player1 == 3) {
		if(player1 == 1) {
		System.out.println("player2 is winner and player1 is Loseer");
		}else{
		System.out.println("player1 is winner and player2 is losser");
		}
	} else {
		System.out.println("You input wrong number");
	}
	}
	
	public static void main(String[] args)
	{
	Ch5_Q6_ScissorRockPaperGame g = new Ch5_Q6_ScissorRockPaperGame(1,2);
	g.DetermineWinner();
	}
}