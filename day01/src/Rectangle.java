public class Rectangle {
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(){
         this(1.0,1.0);
    }

    public void setLength(double length) {
        this.length=length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }
}
