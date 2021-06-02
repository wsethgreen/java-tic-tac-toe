package com.company;

public class TicTacToeClass
{
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner( char p ) {
        // if top row are the same chars
        if (board[0][0] == p && board[0][1] == p && board[0][2] == p) {
            return true;
        }
        // if middle row are the same chars
        else if (board[1][0] == p && board[1][1] == p && board[1][2] == p) {
            return true;
        }
        // if bottom row are the same chars
        else if (board[2][0] == p && board[2][1] == p && board[2][2] == p) {
            return true;
        }
        // if left column are the same chars
        else if (board[0][0] == p && board[1][0] == p && board[2][0] == p) {
            return true;
        }
        // if middle column are the same chars
        else if (board[0][1] == p && board[1][1] == p && board[2][1] == p) {
            return true;
        }
        // if right column are the same chars
        else if (board[0][2] == p && board[1][2] == p && board[2][2] == p) {
            return true;
        }
        // if diagonal (top left to bottom right) are the same chars
        else if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
            return true;
        }
        // if diagonal (top right to bottom left) are the same chars
        else if (board[0][2] == p && board[1][1] == p && board[2][0] == p) {
            return true;
        }
        // else there are no winners
        else {
            return false;
        }
    }

    public boolean isFull() {
        // return True if the players have made a total of 9 combined moves.
        // Else, false.
        return turns == 9;
    }

    public boolean isCat() {
        // If both X and O have NOT won, and the board is full, return true.
        // Else, false.
        if (!isWinner('X') && !isWinner('O') && isFull()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValid( int r, int c ) {
        // If the player makes a move within the confounds of the board,
        // and the board space is empty, return true. Else, false.
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 && board[r][c] == ' ' )
            return true;
        else
            return false;
    }

    public int numTurns() {
        return turns;
    }

    public char playerAt( int r, int c ) {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    // Modifiers
    public void playMove( char p, int r, int c ) {
        // If the player makes a valid move, update the appropriate space,
        // and add one move to the turns counter.
        if (isValid(r, c)) {
            board[r][c] = p;
            turns += 1;
        }
    }

}