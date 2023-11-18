import java.io.*;
import java.util.*;

public class Respond implements Serializable{
    private Map<Character,Integer> map;

    public Respond(Map<Character, Integer> map) {
        this.map = map;
    }

    public Map<Character, Integer> getMap() {
        return map;
    }
}