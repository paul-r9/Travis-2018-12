public class TicTacToe {

    private static boolean lol;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isValidCoordinate(int x, int y) {

        return x >= 0 && x <= 2 && y >= 0 && y <= 2;
    }

    public static void placeToken(int x, int y) {
        lol = true;
    }

    public static boolean isCoordTaken(int x, int y) {
        return lol;
    }
}
