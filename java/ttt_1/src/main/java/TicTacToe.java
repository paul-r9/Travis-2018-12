public class TicTacToe {
    private boolean[][] playGrid = new boolean[3][3];

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    Position convertInputToPos(int userInput) {
        return new Position(getRow(userInput), getColumn(userInput));
    }

    boolean isFree(int userInput) {
        return !playGrid[getRow(userInput)][getColumn(userInput)];
    }

    private int getColumn(int userInput) {
        return (userInput - 1) % 3;
    }

    private int getRow(int userInput) {
        return userInput / 3;
    }

    void play(int userInput) {
        playGrid[getRow(userInput)][getColumn(userInput)] = true;
    }
}

