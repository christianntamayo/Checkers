public class Tile {
    //properties of a tile
    private boolean isEmpty;
    private char tileState;
    private String color;
    private int row, col;

    //constructor
    Tile(int row, int col, String color, char tileState, boolean isEmpty) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.tileState = tileState;
        this.isEmpty = isEmpty;
    }

    //tile methods

    //what is the state of the tile
    public char tileState() {
        return this.tileState;
    }

    //is it empty or not
    public boolean isEmpty() {
        return this.isEmpty;
    }
}

