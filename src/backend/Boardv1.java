package backend;

import java.util.ArrayList;
import java.util.Random;

public class Boardv1 {
    private Square[][] boardstate;
    private int n;

    // 2<n<10
    public Boardv1(int n) {
        this.n = n;
        this.boardstate = new IntPairTile[n][n];
    }

    public int size() {
        return this.n;
    }

    public Square[][] getBoardstate() {
        return this.boardstate;
    }

//  Need to check to see if any placements are forced after each placement, both from only one location working for a number or a location only having one number
    public void generate() {
        Integer[][] rows = new Integer[n][n];
        Integer[][] columns = new Integer[n][n];

        for (int i=0; i < n;i++) {
            for (int j=0; j < n;j++) {

                this.boardstate[i][j] = new IntPairTile(new Border(),new Border(),new Border(),new Border());

                Integer[] notPossible = rows[i].clone();

                for (int numCheck = 0; numCheck < n; numCheck++) {
                    if (notPossible[numCheck] == null) {
                        notPossible[numCheck] = columns[j][numCheck];
                    }
                }

                ArrayList<Integer> possible = new ArrayList<Integer>();
                for (int num = 0; num < n; num++) {
                    if (notPossible[num] == null) {
                        possible.add(num);
                    }
                }

                Random random = new Random();
                System.out.println(possible);
                int choice = possible.get(random.nextInt(possible.size()));
                this.boardstate[i][j].setSolution(choice);

                rows[i][choice] = choice;
                columns[j][choice] = choice;
            }
        }
    }

    public void string() {
        for (int j = 0;j<n;j++) {
            for (int i = 0; i<n; i++) {
                System.out.print(this.boardstate[i][j].getSolution());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
