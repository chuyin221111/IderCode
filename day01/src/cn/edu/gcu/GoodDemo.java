package cn.edu.gcu;

public class GoodDemo {
    private static int n;

    public static void main(String[] args) {
        Goods p=new Goods("笔",12.3,12);
        int c=p.buy(5);
        p.setNumber(p.sale(c,7));
        p.print();
    }


}
