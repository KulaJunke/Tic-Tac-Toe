package com.company;

public class main {

    public static void main(String[] args){
        int turn = 0;
        int winner = -1;
        int[] board = new int[9];
        for(int i = 0; i < board.length; i++) {
            board[i] = -1;
        }
        player a = new player(0);
        player b = new player(1);
        player[] players = new player[2];
        players[0] = a;
        players[1] = b;

        while(winner == -1){
            printBoard(board);
            int turnField = players[turn].getTurn();
            if (players[turn].validateTurn(board, turnField)){
                board[turnField] = players[turn].number;
                turn = (turn + 1) % 2;
            }
            winner = checkWinner(board);
        }
        printBoard(board);
        System.out.println("Herzlichen Glühwurm, Spieler " + winner + "! hast gewonnen!");
    }

    public static int checkWinner(int[] board){
        int winner = -1;
        if(board[0] == board[1] && board[0] == board[2] && board[0] != -1){
            winner = board[0];
        }
        else if(board[3] == board[4] && board[3] == board[5] && board[0] != -1) {
            winner = board[3];
        }
        else if(board[6] == board[7] && board[6] == board[8] && board[0] != -1) {
            winner = board[6];
        }
        else if(board[0] == board[3] && board[0] == board[6] && board[0] != -1) {
            winner = board[0];
        }
        else if(board[1] == board[4] && board[1] == board[7] && board[0] != -1) {
            winner = board[1];
        }
        else if(board[2] == board[5] && board[2] == board[8] && board[0] != -1) {
            winner = board[2];
        }
        else if(board[0] == board[4] && board[0] == board[8] && board[0] != -1) {
            winner = board[0];
        }
        else if(board[2] == board[4] && board[2] == board[6] && board[0] != -1) {
            winner = board[2];
        }
        else if(board[0] != -1 && board[1] != -1 && board[2] != -1 && board[3] != -1 && board[4] != -1 && board[5] != -1
                && board[6] != -1 && board[7] != -1 && board[8] != -1){
            winner = -1;
        }
        return winner;
    }

    public static void printBoard(int[] meinBoard){
        System.out.println(meinBoard[0] + " | " + meinBoard[1] + " | " + meinBoard[2]);
        System.out.println("_________");
        System.out.println(meinBoard[3] + " | " + meinBoard[4] + " | " + meinBoard[5]);
        System.out.println("_________");
        System.out.println(meinBoard[6] + " | " + meinBoard[7] + " | " + meinBoard[8]);
    }
}
