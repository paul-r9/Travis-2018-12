public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    Position convertInputToPos(int userInput) {
        return new Position(getRow(userInput), getColumn(userInput));
    }

    boolean isFree(int userInput) {
        return true;
    }

    private int getColumn(int userInput) {
        return (userInput - 1) % 3;
    }

    private int getRow(int userInput) {
        return userInput / 3;
    }
}

