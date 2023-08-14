package SqureLinkedList_Stuff;

public class Node {
    Square data;
    Node next;

    public Node(Square data) {
        this.data = data;
        next=null;
    }

    public Square getData() {
        return data;
    }

    public void setData(Square data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
