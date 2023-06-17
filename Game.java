public class Game {
    //all the game logic

    //everything needed for the game to happen
    private Bitboard board;
    private Player playerWhite;
    private Player playerBlack;


    public Game() {
        this.board = new Bitboard();
        this.playerWhite = new Player("white", this.board.getWhiteStones());
        this.playerBlack = new Player("black", this.board.getBlackStones());
    }
    
    //the game method
    public void playGame() {
        //game loop goes here!
        
        //print board
        System.out.println(board);
        //test move
        this.playerBlack.moveStone("A7");
        //board update
        System.out.println(board);

    }
}
