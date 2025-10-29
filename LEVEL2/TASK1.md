
---

## 🎮 TASK 1 – Tic-Tac-Toe Game

### 💻 Source Code

```java
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
        // check all rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        // check all columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
                return true;
        }
        // check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

}
```

---

### 🧠 Explanation

This program is a **console-based Tic-Tac-Toe game** that allows two players to play alternately (Player X and Player O). It demonstrates **array manipulation, conditional logic, and method usage** in Java.

#### 🪶 Step-by-step Breakdown

1. **Board Initialization:**
   A 3x3 character array `board` is created to represent the Tic-Tac-Toe grid, initially filled with blank spaces `' '`.

2. **Gameplay Loop:**
   A `for` loop runs for a maximum of 9 turns — since a 3x3 grid can have at most 9 moves.
   Each iteration represents one player’s turn.

3. **Player Input:**
   The program asks the current player (`X` or `O`) to enter their desired row and column number to place their move.

4. **Move Validation:**
   If the chosen cell is already taken, it prompts the player to try again without advancing the turn counter.

5. **Checking for a Winner:**
   After each valid move, the program calls `checkWinner()` to see if the current player has formed a line horizontally, vertically, or diagonally.

6. **Switching Turns:**
   If no winner is found, the turn switches between Player X and Player O.

7. **Result Display:**

   * If a player wins, the game stops immediately and displays the winner.
   * If all 9 cells are filled without a winner, the program declares a **draw**.

8. **Clean Exit:**
   The scanner is closed to prevent memory leaks and maintain best coding practices.

---

### 🧾 Example Output

```
-------
| | | |
-------
| | | |
-------
| | | |
-------
Enter your move X (row and col):
0 0
-------
|X| | |
-------
| | | |
-------
| | | |
-------
Enter your move O (row and col):
1 1
...
Player X wins!
```

---

### 📘 Summary

✅ Demonstrates 2D arrays
✅ Uses user input with validation
✅ Applies loops and methods for modular coding
✅ Includes logic for checking rows, columns, and diagonals

---

