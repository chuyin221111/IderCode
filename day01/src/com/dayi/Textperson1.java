package com.dayi;   //匿名对象一旦被赋值就没有意义，就会被当成垃圾

class Person1
{
    String name="lisi";
     int age=12;
     String sex="n";
    public void talk()
    {
        System.out.println( "姓名："+name+",年龄："+age+",性别："+sex);
    }
}
public class Textperson1 {
    public static void main(String[] args) {
        new Person1().talk();
    }
}
