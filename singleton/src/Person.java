public class Person {
    static int autoId;
    int id;
    String username;
    String password;
    char gender;
    private Person(){
        autoId=1;
        id=1;
    }
    private static Person instance=new Person();
    public static Person getInstance(){
        return instance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
