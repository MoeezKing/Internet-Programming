import java.io.Serializable;

public class Request implements Serializable {
    private String str;

    public String getStr() {
        return str;
    }

    public Request(String str) {
        this.str = str;
    }
}
