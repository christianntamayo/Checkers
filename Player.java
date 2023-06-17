import java.util.ArrayList;

public class Player {
    //properties of the player

    //all of the players pieces
    private ArrayList<Stone> stones;

    //how many pieces
    private int numPieces;

    //what color is the player
    private String color;

    //constructor that gives the pieces to the player
    public Player(String color, ArrayList<Stone> stones) {
        //set the color
        this.color = color;
        //give the player its stones
        this.stones = stones;
        //set to 12
        this.numPieces = 12;
    }

    //move method, 

    //for now lets just move forward i guess as a test
    public void moveStone(String tileName) {
        //go through each of the players tiles, check if any of the stones are on that tile so we know that is the one that is going to move
        for (Stone stone : this.stones) {
            //check the name
            if(stone.getTile().getName().equals(tileName)) {
                //move selected stone
                Tile currentTile = stone.getTile();
                int currentRow = currentTile.getRow();
                int newRow = currentRow + 1;
                //get rid of the tile on previous
                currentTile.setState('-');
                //set stone to the new tile
                stone.setTile(stone.getBoard().getTile(newRow, stone.getCol()));
                //set the tile state on the board
                stone.getTile().setState('B');
            }
        }
    }

    //toString
    public String toString() {
        return "Player: " + this.color + "\n" + "Pieces: " + this.numPieces + "\n";
    }
    
}
