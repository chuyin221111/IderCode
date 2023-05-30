package com.dayi;

class Person {
    String name;
    int age;
   String like;
  public void setName(String str)
  {
      name=str;
  }
  public void setAge(int a)
  {
      age=a;
  }
  public void setLike(String str)
  {
      like=str;
  }
  public String getName()
  {
      return name;
  }
  public int getAge()
  {
      return age;
  }
  public String getLike()
  {
      return like;
  }
  public  void talk()
  {
      System.out.println("我是："+name+",今年:"+age+"岁,兴趣:"+like+"");
  }
}

public class Textper {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("张三");
        p.setAge(30);
        p.setLike("喜欢运动");
        p.talk();

    }
}
