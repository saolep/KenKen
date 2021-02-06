package backend;

public class Border {
    boolean filled;

    public Border() {
        this.filled = true;
    }

    public void toggle() {
        this.filled = !this.filled;
    }

    public boolean check() {
        return this.filled;
    }
}
