import java.io.Serializable;

public class Respond implements Serializable {
    private int count;

    public int getCount() {
        return count;
    }

    public Respond(int count) {
        this.count = count;
    }
}
