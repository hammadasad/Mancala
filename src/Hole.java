/**
 * Created by admin on 2016-03-09.
 */
public class Hole {

    //Fields
    private int stones;
    private int row;
    private int column;
    private boolean isMancala;
    private boolean isBlue = true;

    public Hole(int stones, int row, int column, boolean isMancala) {
        this.stones = stones;
        this.row = row;
        this.column = column;
        this.isMancala = isMancala;
    }

    public Hole(int stones, int row, int column, boolean isMancala, boolean makeRed) {
        this.stones = stones;
        this.row = row;
        this.column = column;
        this.isMancala = isMancala;
        if(makeRed == true) setRed();
    }

    //Set owner, true => Player1/Blue , false => Player2/Red
    public void setRed() {
        isBlue = false;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public int getStones() {
        return stones;
    }

    public void removeStones() {
        stones = 0;
    }

    public void addStone() {
        stones += 1;
    }

    public boolean isEmpty() {
        if(stones == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isMancala() {
        return isMancala;
    }

    public String getKey() {
        return "" + row + "," + column;
    }

    public String toString() {
        return "" + getStones();
    }
}
