public class Circle {
    int r;
    public Circle(){

    }
    public  Circle(int r){
        this.r=r;
    }
    public int getR() {
        return r;
    }

    public void setR(int r) {

        this.r = r;
    }
  public void Perimeter(int r)
  {
      float c;
      c=(float)(2*3.14*r);
      System.out.println(c);
  }
  public void  area(int r){
        float a;
        a=(float)3.14*r*r;
      System.out.println(a);
  }
}


