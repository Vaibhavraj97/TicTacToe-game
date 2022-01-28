package com.bridgelabz.game;

public class TicTacToeGame {
	   
       public static void main(String args []){
         
          char[] board =  populateEmptyBoard();
           
  }
 
	private static char[] populateEmptyBoard() {
		char[] board =new char[10];
		for (int i = 0; i< board.length ; i++) {
			board[i] =' ';
		}
		return board;
	}
  
}

