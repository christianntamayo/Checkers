public class Bitboard {
    //properties of the bitboard
    private Tile[][] board;
    private int rowWidth = 8;
    private int colWidth = 8;

    //bitboard constructor
    Bitboard() {
        //initialize the board with the width
        this.board = new Tile[rowWidth][colWidth];

        //put in the tiles into the board
        for (int row = 0; row < this.board.length; row++) {
            for (int col = 0; col < this.board.length; col++) {
                
                //initialize the tiles 

                //the first row and last row have all the main pieces
                if(row == 0 || row == 7) {
                    //white tiled rooks
                    if(col == 0 || col == 7) {
                        //make the tile
                        Tile t = new Tile(row, col, "white", 'R', false);
                        this.board[row][col] = t;
                    }
                    //knights
                    if(col == 1 || col == 6) {
                       
                    }
                    //bishops
                    if(col == 2 || col == 5) {
                        
                    }
                    //queen
                    if(col == 3) {
                        
                    }
                    //king
                    if(col == 4) {
                        
                    }
                    
                }
                //pawn defense line
                if(row == 1 || row == 6) {
                    
                }
                
                //all empty spots on the board
                if(row == 2 || row == 3 || row == 4 || row == 5) {
                    
                }
            }
        }
    }

}
