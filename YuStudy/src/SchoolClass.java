/**
 * @auther chuyin
 * @date 2023/7/2
 * @project java SE
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2、班级类SchoolClass,
 * 私有属性：年级，专业，班级名，班级学生信息（用ArrayList存储班级所有学生信息）
 * 公有构造方法：给年级，专业，班级赋值，对班级学生信息属性进行初始化；
 * 公有方法：
 * init:无参数，先输入要录入的学生个数，再一次输入学生的学号，姓名、专业创建学生对象，并添加到班级学生信息属性中；
 * searchByID:根据输入的学号查询学生信息，返回找到的学生对象，否则返回null；
 * searchByName:根据输入的姓名查询学生信息，返回找到的学生对象，否则返回null；
 * print:遍历班级中每一个学生，输出每个学生的所有信息；
 * del:根据输入的学号，删除班级中指定的学生，删除成功返回true，失败返回false；
 */
public class SchoolClass {
   //年级名
   private  String   class1;
   //班级名
   private String   classname;
   //专业
   private String pro;
   //班级学生信息
   private ArrayList<Student> allclass;


   public SchoolClass(String class1,String pro,String classname) {
      this.class1 = class1;
      this.pro=pro;
      this.classname=classname;
   this.allclass=new ArrayList<>();
   }

   public String getClass1() {
      return class1;
   }



   public String getPro() {
      return pro;
   }



   public String getClassname() {
      return classname;
   }



   public void init()
   {
      System.out.println("请输入要录入的个数：");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     for(int i=0;i<n;i++)
     {
        Student s1=new Student();
        System.out.println("请输入第"+(i+1)+"学生的学号");
        Scanner d=new Scanner(System.in);
        s1.number=d.nextLine();
        System.out.println("请输入第"+(i+1)+"学生的姓名");
        Scanner e=new Scanner(System.in);
        s1.name=e.nextLine();
        System.out.println("请输入第"+(i+1)+"学生专业");
        Scanner w=new Scanner(System.in);
        s1.pro=w.nextLine();
      allclass.add(i,s1);

     }

   }
   public String searchByID(String number)
   {
      for(Student s:allclass)
      {
         if(number.equals(s.number))
         {
            return "学生姓名："+s.getName()+"学生专业："+s.getPro();
         }
      }
      return null;
   }
   public String searchByName(String name)
   {
      for(Student s:allclass)
      {
         if(name.equals(s.name))
         {
            return "该学生学号："+s.getNumber()+"该学生专业："+s.getPro();
         }
      }
      return null;
   }
   public void print()
   {

      for(Student s:allclass)
      {
         System.out.println("学生姓名："+s.getName()+"学生学号："+s.getNumber()+"学生专业"+s.getPro());
      }
   }
   public boolean del(String number)
   {
      for(Student s:allclass)
      {
         if(number.equals(s.getNumber()))
         {
           return  allclass.remove(s);

         }
      }
      return false;
   }
}
