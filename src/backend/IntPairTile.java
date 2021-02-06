package backend;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class IntPairTile implements Square{
    private Integer[] guesses;
    private Integer sol;
    private Border topBorder;
    private Border bottomBorder;
    private Border rightBorder;
    private Border leftBorder;

    // guesses is a list of integers of length 9 only given values if a guess is registered.
    public IntPairTile(Border top,Border bottom,Border right,Border left) {
        this.guesses = new Integer[9];
        this.topBorder = top;
        this.bottomBorder = bottom;
        this.rightBorder = right;
        this.leftBorder = left;
    }

    // Sets the solution for the tile
    public void setSolution(int sol) {
        this.sol = sol;
    }

    // Returns the solution integer for the tile
    public Integer getSolution() {
        return this.sol;
    }

    // Toggles a guess from 1 to 9 into the guesses array. Returns true if adding and false if removing
    public boolean toggleGuess(int guess) {
        if (this.guesses[guess-1] == null) {
            this.guesses[guess-1] = guess;
            return true;
        } else {
            this.guesses[guess - 1] = null;
            return false;
        }
    }

    // Returns the array of guesses
    public Integer[] getGuesses(){
        return this.guesses;
    }

    // returns the border at the top of the square
    public Border topBorder() {
        return this.topBorder;
    }

    // returns the border at the bottom of the square
    public Border bottomBorder() {
        return this.bottomBorder;
    }

    // returns the border at the right of the square
    public Border rightBorder() {
        return this.rightBorder;
    }

    // returns the border at the left of the square
    public Border leftBorder() {
        return this.leftBorder;
    }
}
