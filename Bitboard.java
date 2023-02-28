public class Bitboard {

    //instance variables

    //the 2D array containing all the characters representing the state of the board
    private char[][] board;
    
    //characters representing pieces
    char empty = '-';
    char pawn = 'P';
    char rook = 'R';
    char knight = 'K';
    char bishop = 'B';
    char queen = 'Q';
    char king = 'K';
    
    //constructor to set the board
    public Bitboard() {

        //chess boards are 8x8
        int columns = 8;
        int rows = 8;
        board = new char[rows][columns];

        //go through each row and column and set the position of each and every piece
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {

                //all pieces
                if(row == 0 || row == 7) {
                    //rooks
                    if(col == 0 || col == 7) {
                        board[row][col] = this.rook;
                    }
                    //knights
                    if(col == 1 || col == 6) {
                        board[row][col] = this.knight;
                    }
                    //bishops
                    if(col == 2 || col == 5) {
                        board[row][col] = this.bishop;
                    }
                    //queen
                    if(col == 3) {
                        board[row][col] = this.queen;
                    }
                    //king
                    if(col == 4) {
                        board[row][col] = this.king;
                    }
                    
                }
                //pawn defense line
                if(row == 1 || row == 6) {
                    board[row][col] = this.pawn;
                }
                
                //all empty spots on the board
                if(row == 2 || row == 3 || row == 4 || row == 5) {
                    board[row][col] = this.empty;
                }

            }
        }
    }

    //print out the board
    public void printBoard() {

        //go through rows and then columns
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //print out the character
                System.out.print(board[i][j]);
                //add an extra space for readability
                System.out.print(" ");
            }
            //go to next line
            System.out.println();
        }
    }   

    public char getTileState(int row, int col) {
        //determine what is on the tile
        return this.board[row][col];
    }
}