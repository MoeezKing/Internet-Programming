package SqureLinkedList_Stuff;

import java.util.Date;

public class Square {
    double length;
    Date creationTime;

    public Square(double length) {
        this.length = length;
        creationTime=new Date();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
    public double getArea(){
        return length*length;
    }

    @Override
    public String toString() {
        return "|Square|\n Length is "+this.length+
                " \nIt was created at "+this.creationTime+
                " \nWhose area is "+this.getArea();
    }
}
