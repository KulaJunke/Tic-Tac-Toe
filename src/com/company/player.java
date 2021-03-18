package com.company;

import java.util.Scanner;

public class player {
    int number;
    Scanner scanner = new Scanner(System.in);

    public player(int number){
        this.number = number;
    }

    public int getTurn(){
        System.out.println("Spieler " + number + " ist am Zug");
        int input = scanner.nextInt();
        if (input < 9 && input >= 0){
            return input;
        }
        System.out.println("[ERROR] Ungültige Eingabe! Bitte erneut versuchen!");
        return getTurn();
    }

    public boolean validateTurn(int[] board, int turn){
        if (board[turn] == -1){
            return true;
        }
        return false;
    }

    private void íf(boolean b) {
    }
}
