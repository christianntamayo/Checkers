public class Pawn {
    
    //properties of a pawn?

    //its row and column on the board
    private int row, col;
    //is it able to be captured by enPassant?
    private boolean enPassant;
    //what color is the pawn?
    private String color;

    public Pawn(int row, int col, String color) {

        this.row = row;
        this.col = col;
        this.color = color;
        enPassant = false;

    }


    public void advance() {

    }
}
