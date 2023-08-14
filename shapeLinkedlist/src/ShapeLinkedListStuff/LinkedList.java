package ShapeLinkedListStuff;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
        Shape.autoID=0;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void insertFromStart(double length){
        if(isEmpty()){
            head=new Node(length);
            return;
        }

        Node newNode=new Node(length);
        newNode.setNext(head);
        head=newNode;
    }
    public void insertFromStart(double length,double width){
        if(isEmpty()){
            head=new Node(length,width);
            return;
        }

        Node newNode=new Node(length,width);
        newNode.setNext(head);
        head=newNode;
    }
    public void insertFromStart(float base,float height){
        if(isEmpty()){
            head=new Node(base,height);
            return;
        }

        Node newNode=new Node(base,height);
        newNode.setNext(head);
        head=newNode;
    }
    public void insertFromEnd(double length){
        if(isEmpty()){
            head=new Node(length);
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.getNext();
        }
        Node newNode=new Node(length);
        temp.setNext(newNode);
    }
    public void insertFromEnd(double length,double width){
        if(isEmpty()){
            head=new Node(length,width);
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.getNext();
        }
        Node newNode=new Node(length,width);
        temp.setNext(newNode);
    }
    public void insertFromEnd(float base,float height){
        if(isEmpty()){
            head=new Node(base,height);
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.getNext();
        }
        Node newNode=new Node(base,height);
        temp.setNext(newNode);
    }
    public void deleteFromStart(){
        if(isEmpty())
            return;

        head=head.getNext();
    }
    public void deleteFromEnd(){
        if(isEmpty())
            return;

        Node last=head.getNext();
        Node scdLast=head;
        while(last.getNext()!=null){
            scdLast=last;
            last=last.getNext();
        }
        scdLast.setNext(null);
    }
    public void print(){
        if(isEmpty())
            return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+" -->");
            temp=temp.getNext();
        }
        System.out.println("NULL");
    }
}
