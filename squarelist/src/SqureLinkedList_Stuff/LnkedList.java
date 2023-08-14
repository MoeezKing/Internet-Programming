package SqureLinkedList_Stuff;

public class LnkedList {
    Node head;

    public LnkedList() {
        this.head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void insertFromStart(double length){
        if(isEmpty()){
            head=new Node(new Square(length));
            return;
        }

        Node newNode=new Node(new Square(length));
        newNode.setNext(head);
        head=newNode;
    }
    public void insertFromEnd(double length){
        if(isEmpty()){
            head=new Node(new Square(length));
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.getNext();
        }
        Node newNode=new Node(new Square(length));
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

