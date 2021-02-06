package backend;

public class Pair<Integer> {
    private int zero;
    private int one;

    public Pair(int zero,int one) {
        this.zero = zero;
        this.one = one;
    }

    // Change the value of an element at 'index' in the pair to 'change'
    public boolean mutate(int index, int change) {
        boolean returned = false;
        if (index == 0) {
            this.zero = change;
            returned = true;
        } else if (index == 1) {
            this.one = change;
            returned = true;
        }
        return returned;
    }

    // given an index number returns the value in the pair at that index. Only takes 0 and 1
    public int index(int index) {
        if (index == 0) {
            return this.zero;
        } else {
            return this.one;
        }
    }

    // Checks equality of pairs element-wise
    public boolean equals(Pair other) {
        if (this.zero == other.index(0) && this.one == other.index(1)) {
            return true;
        } return false;
    }

}
