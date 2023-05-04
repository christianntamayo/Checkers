public class Bitboard {
    //properties of the bitboard

    //2D array of all the tiles
    private Tile[][] board;

    //parameters of the 8x8 board
    private int rowWidth = 8;
    private int colWidth = 8;

    //bitboard constructor that will create all the tiles
    public Bitboard() {
        //initialize the board with the width
        this.board = new Tile[rowWidth][colWidth];

        //variable to switch between black and white 
        String color = "black";

        //put in the tiles into the board
        for (int row = 0; row < this.board.length; row++) {
            //switch the color
            color = tileColorSwitch();
            for (int col = 0; col < this.board.length; col++) {
                
                //first row and last row
                if(row == 0 || row == 7) {

                    if(col == 0) {
                        //rook
                        this.board[row][col] = new Tile(row, col, color, 'R', false);
                    }
                    else if(col == 1) {
                        //horse
                        this.board[row][col] = new Tile(row, col, color, 'H', false);
                    }
                    else if(col == 2) {
                        //bishop
                        this.board[row][col] = new Tile(row, col, color, 'B', false);
                    }
                    else if(col == 3) {
                        //queen
                        this.board[row][col] = new Tile(row, col, color, 'Q', false);
                    }
                    else if(col == 4) {
                        //king
                        this.board[row][col] = new Tile(row, col, color, 'K', false);
                    }
                    else if(col == 5) {
                        this.board[row][col] = new Tile(row, col, color, 'B', false);
                    }
                    else if(col == 6) {
                        this.board[row][col] = new Tile(row, col, color, 'H', false);
                    }
                    else if(col == 7) {
                        this.board[row][col] = new Tile(row, col, color, 'R', false);
                    }

                    //switch the color
                    color = tileColorSwitch();
                }

                //pawn rows
                else if(row == 1 || row == 6) {
                    //all pawns
                    this.board[row][col] = new Tile(row, col, color, 'P', false);
                    //switch col
                    color = tileColorSwitch();
                }

                else if(row == 2 || row == 3 || row == 4 || row == 5) {
                    //empty
                    this.board[row][col] = new Tile(row, col, color, '-', true);
                    color = tileColorSwitch();
                }
            }
        }
    }

    private String tileColorSwitch() {
        String tempColor = "black";

        if(tempColor == "black") {
            //switch to white
            tempColor = "white";
        }
        else {
            //switch to black
            tempColor = "black";
        }

        return tempColor;
    }

    public Tile getTile(int row, int col) {
        return this.board[row][col];
    }

    public void setTileState(int row, int col, char newState) {
        this.board[row][col].setTileState(newState); 
    }

    public void printBoard() {
        //go through rows and then columns
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //print out the character
                System.out.print(board[i][j].getTileState());
                //add an extra space for readability
                System.out.print(" ");
            }
            //go to next line
            System.out.println();
        }
        //one last when done
        System.out.println();
    }

    public void movePawn(Piece pawn) {
        int row = pawn.getRow();
        int col = pawn.getCol();
        setTileState(row, col, '-');
        setTileState(row-1, col, 'P');

        
    }
}
