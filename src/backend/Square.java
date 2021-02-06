package backend;

public interface Square {

    // Need to add disjoint set membership method?
    // Borders default to being filled
    void setSolution(int sol); // Sets an integer value solution for the square
    Integer getSolution(); // Returns the integer value solution assigned to the square
    boolean toggleGuess(int guess); // Sets a guess integer 1-9 if not guessed, but if guessed instead sets that index value to null
    Integer[] getGuesses(); // returns the Integer[] containing all guesses made on the square
    Border topBorder(); // returns a boolean indicating if the top border is an external edge of the set
    Border bottomBorder(); // returns a boolean indicating if the bottom border is an external edge of the set
    Border rightBorder(); // returns a boolean indicating if the right border is an external edge of the set
    Border leftBorder(); // returns a boolean indicating if the left border is an external edge of the set
}
