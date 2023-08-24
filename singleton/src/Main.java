public class Main {
    public static void main(String[] args) {
        Person p1=Person.getInstance();

        p1.setGender('M');
        p1.setUsername("Ali");
        p1.setPassword("ali123");

        System.out.println("Hash code os p1 is "+ p1.hashCode());

        Person p2=Person.getInstance();
        System.out.println("Hash code os p2 is "+ p2.hashCode());

        System.out.println(p1==p2);
    }
}