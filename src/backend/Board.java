package backend;

public interface Board {

    //Need to add some talking about specific disjoint set membership stuff, might fit better in square with a method of set belonging
    
    Square[][] getBoardstate(); //
    int size(); //
    void generate(); //


}
