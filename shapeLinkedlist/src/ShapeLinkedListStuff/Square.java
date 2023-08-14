package ShapeLinkedListStuff;

import java.util.Date;

public class Square extends  Shape{

    double length;
    int id;
    Date creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Square(double length) {
        this.length = length;
        this.id=(++super.autoID);
        creationTime=new Date();

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "|Square|\nLength = "+this.length+
                " \n Area= "+(this.length*this.length)+
                "\nWhose ID = "+this.id+
                "\nIt was created at "+this.creationTime;
    }

    @Override
    public void draw(){
        System.out.println("****\n****\n****\n****");
    }
}
