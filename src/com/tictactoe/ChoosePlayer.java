package com.tictactoe;

public class ChoosePlayer {
	public static void main(String[] args) {
		double player1;
		char charcter;
		player1=(double) Math.random()*10 % 2;
		if(player1==1) {
			charcter='X';
			System.out.println("The palyer1 choose 'x' is the player");
		}else
			charcter='O';
		System.out.println("The player1 choose 'o' is the computer");
	}
}
