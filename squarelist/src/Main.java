import SqureLinkedList_Stuff.LnkedList;
import SqureLinkedList_Stuff.Square;

public class Main {
    public static void main(String[] args) {

        LnkedList l=new LnkedList();
        for(double i = 10;i<=50; i+=10){
            l.insertFromStart(i);
        }
        for(double i = 100;i>=60; i-=10){
            l.insertFromEnd(i);
        }

        l.print();

    }
}