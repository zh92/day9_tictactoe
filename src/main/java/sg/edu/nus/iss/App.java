package sg.edu.nus.iss;


public final class App {
    public static void main(String[] args) {

        String[] board = new String[9];
        //Player X and O
        String player = "X";

        for (int i=0; i<board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }

        TicTacToe ttt = new TicTacToe();
        //Print out initial tictactoe board
        ttt.printBoard(board);

        System.out.println("Tic-Tac-Toe game");
        System.out.println("----------------");
        System.out.println("X will play first");

        ttt.checkWinner(board);
    }
}
