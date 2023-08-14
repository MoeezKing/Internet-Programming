public class Main {
    public static void main(String[] args) {

    MyThread t1=new MyThread("Even",false,10);
    MyThread t2=new MyThread("Odd",true,12);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    t1.start();
    t2.start();
    }
}