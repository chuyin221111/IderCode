package com.dayi;

public class GreatPerson {
    public static void main(String[] args) {
        Personman p=new Personman("zhangsan","nan",25);
        System.out.println(p.getName()+","+p.getSex()+","+p.getAge());
        System.out.println("-----------------");
        Personman p1=new Personman();
        p1.setName("lisi");
        p1.setSex("zhongxing");
        p1.setAge(28);
        System.out.println(p1.getName()+","+p1.getSex()+","+p1.getAge());
        System.out.println("----------------");
        Personman p3=new Personman();
        p3.name="xiaoming";
        p3.sex="M";
        p3.age=37;
        System.out.println(p3.name+","+p3.sex+","+p3.age+",");

    }
}
