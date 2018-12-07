public class TicTacToe {

    public char [][] getBoard() {
        char [][] board = new char [3][3];
        for (int outerIndex = 0; outerIndex < 3; outerIndex++ ){
            for (int innerIndex = 0; innerIndex < 3; innerIndex++ ){
                board [outerIndex][innerIndex] = ' ';
            }
        }

        return board;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
