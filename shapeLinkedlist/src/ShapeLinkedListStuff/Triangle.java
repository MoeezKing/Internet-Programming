package ShapeLinkedListStuff;

import java.util.Date;

public class Triangle extends  Shape{
    float base;
    float height;
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

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
        this.id=(++autoID);
        creationTime=new Date();
    }

    @Override
    public String toString() {
        return "|Triangle|\nbase = "+this.base+
                " \nheight is "+this.height +
                " \n Area= "+((this.base*this.height)/2)+
                "\nWhose ID = "+this.id+
                "\nIt was created at "+this.creationTime;
    }

    @Override
    public void draw() {
        System.out.println("*\n**\n***\n****");
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
