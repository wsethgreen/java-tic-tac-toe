package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a 3x3 tic tac toe board
            // - represents empty space
            // x represents player 1
            // o represents player 2
        char[][] board = new char[3][3];

        // Fill the board with dashes/empty spaces
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Print the board to the console.

    }
}
