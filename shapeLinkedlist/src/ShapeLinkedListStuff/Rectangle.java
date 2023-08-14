package ShapeLinkedListStuff;

import java.util.Date;

public class Rectangle extends Shape{
    double length;
    double width;
    int id;
    Date creationTime;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.id=(++autoID);
        this.creationTime=new Date();
    }

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

    @Override
    public String toString() {
        return "|Rectangle|\nLength = "+this.length+
                " \nWidth is "+this.width +
                " \n Area= "+(this.width*this.length)+
                "\nWhose ID = "+this.id+
                "\nIt was created at "+this.creationTime;
    }

    @Override
    public void draw() {
        System.out.println("****\n****\n****");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
