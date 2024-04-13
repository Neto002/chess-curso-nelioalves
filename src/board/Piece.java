package board;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        // Returns the first character of the piece as a String
        return String.valueOf(getClass().getSimpleName().charAt(0));
    }
}
