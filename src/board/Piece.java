package board;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] possibleMoves = possibleMoves();

        for (int i = 0; i < possibleMoves.length; i++) {
            for (int j = 0; j < possibleMoves[i].length; j++) {
                if (possibleMoves[i][j]) {
                    return true;
                }
            }
        }

        return false;
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
