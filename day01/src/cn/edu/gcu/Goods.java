package cn.edu.gcu;

public class Goods {
    private   String name;
    private  int number;
    private double money;
    public Goods(String name,double money) {
        this(name,money,0);
    }

    public Goods(String name,double money,int number) {
        this.name = name;
        this.money = money;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public int  buy(int n)
    {   //n为购买数量
        System.out.println("购买数量为"+n);
        number += n;
        System.out.println("总数量为"+number);
        return number;
    }
    public int sale(int number,int n){
        //n为销售数量
        System.out.println("销售数量"+n);
        int sum=number-n;
       if(number>=n)
       {
           System.out.println("数量还剩"+sum);
           return sum;
       }
       else {
           System.out.println("销售数量不够");
           return 0;
       }
    }
    public void print()
    {
        System.out.println("商品的最新信息如下");
        System.out.println("名称"+":"+name+","+"数量"+":"+number+","+"单价"+":"+money);
    }
}
