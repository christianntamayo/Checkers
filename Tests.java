public class Tests {
    public static void main(String[] args) {

        Bitboard myBoard = new Bitboard();
        
        Tile testTile = new Tile(1, 1, "black", "A1", '-', true);
        //System.out.println(testTile);

        Stone testStone = new Stone(testTile, "white", myBoard);
        //System.out.println(testStone);

        System.out.println(myBoard);
    }
}
