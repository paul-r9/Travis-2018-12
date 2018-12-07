public class Position {
    public int row;
    public int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position)
            return this.row == ((Position) obj).row
                    && this.column == ((Position) obj).column;

        return false;
    }
}
