package TemplateMethod;
import java.util.Scanner;

public class TicTacToe extends Game {

    char[][] board;
    int currentPlayer;
    boolean gameEnded;
    int winner;

    @Override
    public void initializeGame(int numberOfPlayers) {
        board = new char[3][3];
        currentPlayer = 0;
        gameEnded = false;
        winner = -1;
    }

    @Override
    public boolean endOfGame() {
        if (checkWinner('X')) {
            winner = 0;
            gameEnded = true;
            return true;
        } else if (checkWinner('O')) {
            winner = 1;
            gameEnded = true;
            return true;
        } else if (isBoardFull()) {
            gameEnded = true;
            return true;
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + (player + 1) + ", enter your move (row and column):");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        while (row < 1 || row > 3 || column < 1 || column > 3 || board[row - 1][column - 1] != '\u0000') {
            System.out.println("Invalid move. Please try again.");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        board[row - 1][column - 1] = (player == 0) ? 'X' : 'O';
        displayBoard();
    }

    @Override
    public void displayWinner() {
        if (winner != -1) {
            System.out.println("Player " + (winner + 1) + " wins!");
        } else {
            System.out.println("The game is a draw.");
        }
        System.out.println("The game has ended. The board is as follows:");
        displayBoard();
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean checkWinner(char player) {
        int[][] directions = {
                {0, 1}, // right
                {1, 0}, // down
                {0, -1}, // left
                {-1, 0}, // up
                {1, 1}, // down-right
                {-1, -1}, // up-left
                {1, -1}, // down-left
                {-1, 1} // up-right
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == player) {
                    for (int[] direction : directions) {
                        int x = i, y = j, match = 0;
                        for (int l = 0; l < 3; l++) {
                            if (x < 0 || x >= board.length || y < 0 || y >= board[x].length || board[x][y] != player) {
                                break;
                            }
                            x += direction[0];
                            y += direction[1];
                            match++;
                        }
                        if (match == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}