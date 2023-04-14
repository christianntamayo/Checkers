import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        Bitboard myBoard = new Bitboard();
        myBoard.printBoard();

        Pawn whitePawn = new Pawn(6, 0, "white", myBoard);
        whitePawn.advance();
        myBoard.printBoard();
    }
}
