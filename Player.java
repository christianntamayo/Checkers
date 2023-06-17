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

    //moving
    public void moveStone(String desiredStoneTileName, String desiredNewTileLocation) {
        Stone currentStone;

        //go through the array list
        for (Stone s : this.stones) {
            if(s.getTile().getName().equals(desiredStoneTileName)) {
                //this is the stone we are moving!
                currentStone = s;
                break;
            }
        }
 
    }

    //toString
    public String toString() {
        return "Player: " + this.color + "\n" + "Pieces: " + this.numPieces;
    }

    //toString
    public String toString() {
        return "Player: " + this.color + "\n" + "Pieces: " + this.numPieces + "\n";
    }
    
}
