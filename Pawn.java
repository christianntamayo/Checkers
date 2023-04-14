public class Pawn {
    
    //properties of a pawn?

    //its row and column on the board
    private int row, col;
    //is it able to be captured by enPassant?
    private boolean enPassant;
    //what color is the pawn?
    private String color;
    //give it a link to the board
    private Bitboard board;

    public Pawn(int row, int col, String color, Bitboard board) {

        this.row = row;
        this.col = col;
        this.color = color;
        this.board = board;
        enPassant = false;

    }

    public int getRow() {
        return this.row;
    }
    public int getCol() {
        return this.col;
    }



    public void advance() {
        //change the tile state of the board
        this.board.movePawn(this);
        //mopve it up
        this.col--;
        
    }
}
