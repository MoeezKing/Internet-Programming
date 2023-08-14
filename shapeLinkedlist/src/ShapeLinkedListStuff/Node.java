package ShapeLinkedListStuff;

public class Node {

    Shape data;
    Node next;

    public Node(double length) {

        this.data = new Square(length);
        next=null;
    }
    public Node(double length,double width) {

        this.data = new Rectangle(length,width);
        next=null;
    }
    public Node(float base,float height) {

        this.data = new Triangle(base,height);
        next=null;
    }
    public Shape getData() {
        return data;
    }

    public void setData(Shape data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
