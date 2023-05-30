package com.dayi;

public class Personman {
    String name;
    String sex;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String  sex) {
        this.sex = sex;
    }

    public void setName(String  name) {
        this.name = name;
    }

 public   Personman(){

   }
   public  Personman(String name,String sex, int age )
   {
       this.name=name;
       this.sex=sex;
       this.age=age;
   }
}
