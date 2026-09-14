package LEVEL2;

import java.util.*;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // board
        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
        };
        char currentPlayer = 'X';
        boolean gameWon = false;
        for (int i = 0; i < 9; i++) {// loop
            // call method
            printBoard(board);
            System.out.println("Enter your move " + currentPlayer + "(row and col):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ')
                board[row][col] = currentPlayer;

            else {
                System.out.println("Oops! Already taken. Try again");
                i--;
                continue;
            }

            // call checkWinner method
            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("player" + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            if (currentPlayer == 'X')
                currentPlayer = 'O';
            else
                currentPlayer = 'X';
        }
        if (!gameWon) { // ONLY if nobody won
            printBoard(board);
            System.out.println("It's a draw!");
        }

        sc.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.println("|" + board[i][0] + "|" + board[i][1] + "|" + board[i][2] + "|");
            System.out.println("-------");
        }
    }

    // method
    public static boolean checkWinner(char[][] board, char player) {
        // check all rouws
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        // check all col
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
                return true;
        }
        // check diagnols
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

}
