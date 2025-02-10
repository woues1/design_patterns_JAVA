package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe:");
        Game ticTacToe = new TicTacToe();
        ticTacToe.play(2);
    }
}
