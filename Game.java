public class Game {
    public static void main(String[] args) {
        
        Bitboard myBoard = new Bitboard();
        myBoard.printBoard();

        Piece whitePawn = new Piece(6, 0, "white", myBoard);
        whitePawn.advance();
        myBoard.printBoard();
    }
}
