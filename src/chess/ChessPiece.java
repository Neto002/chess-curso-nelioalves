package chess;

import board.Board;
import board.Piece;
import board.Position;
import chess.enums.Color;

public abstract class ChessPiece extends Piece {
    private final Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    protected void increaseMoveCount() {
        moveCount++;
    }

    protected void decreaseMoveCount() {
        moveCount--;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    public Color getColor() {
        return color;
    }
}
