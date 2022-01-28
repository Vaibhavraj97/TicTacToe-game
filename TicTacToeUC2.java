package com.bridgelabz.game;
import java.util.Scanner;
public class TicTacToeUC2 {
	  static String playerSymbol = "";
      static String computerSymbol = "";
      static int userChoice = 0;
	
	   public static void main(String args []){
		  
		   Scanner sc = new Scanner(System.in);
	          char[] board =  populateEmptyBoard();
	          int userChoice = sc.nextInt();
	          userChoice();
	       
	  }
	 
		private static char[] populateEmptyBoard() {
			char[] board =new char[10];
			for (int i = 0; i< board.length ; i++) {
				board[i] =' ';
			}
			return board;
		}
		
	static void userChoice() {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		 int randomChoice = r.nextInt(2)+1;

			 System.out.println("Select letter of your choice (1:X   2:O):");
			 int userChoiceSymbol=sc.nextInt();
             if(userChoice == 1){
                 playerSymbol = "X";
                 computerSymbol = "O";
                 System.out.println("Player will play");
                }
              else{
                 playerSymbol = "O";
                 computerSymbol = "X";
                 System.out.println("Computer1 will play");
                
               }
		  
		}


}
		
		
		
		
	


	
	

