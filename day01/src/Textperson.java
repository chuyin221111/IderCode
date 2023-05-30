class Person{
     String name;
     int age;
      String sex;
    public Person(String name,int age,String sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public String talk()
    {
        return "姓名："+this.name+",年龄："+this.age+",性别："+this.sex;
    }
}

public class Textperson {
    public static void main(String args[]) {
        Person p=new Person("zhangsan",30,"女");
        System.out.println(p.talk());
    }
}
