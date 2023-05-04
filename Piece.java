public class Piece {
    //properties of the checkers piece

    //the current tile that it is on
    private Tile currentTile;
    //what color is the pawn?
    private String color;
    //give it a link to the board
    private Bitboard board;

    public Piece(Tile currentTile, String color, Bitboard board) {
        //contructor, set the properties of the pawn
        this.currentTile = currentTile;
        this.color = color;
        this.board = board;
    }

    public int getRow() {
        return this.currentTile.getRow();
    }
    public int getCol() {
        return this.currentTile.getCol();
    }

    public void advance() {
        //move the piece
        
    }
}
