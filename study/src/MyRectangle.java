public class MyRectangle  implements IShape{
    double len;
    double wide;

    public MyRectangle(double len,double wide) {
        this.len= len;
        this.wide=wide;
    }

    @Override
    public double getArea() {
        return  this.len*this.wide;
    }

    @Override
    public double getPerimeter() {
        return 2*this.len+2*this.wide;
    }

    void output()
     {
         System.out.println("长："+this.len+"宽："+this.wide);
         System.out.println("面积："+getArea()+",周长："+getPerimeter());
     }
}
