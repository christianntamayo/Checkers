public class Tests {
    public static void main(String[] args) {
        Bitboard myBoard = new Bitboard();
        System.out.println(myBoard);

        Tile testTile = myBoard.getTile(0, 7);
        System.out.println(testTile);
    }
}
