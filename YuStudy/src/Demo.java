/**
 * @auther chuyin
 * @date 2023/7/2
 * @project java SE
 */

import java.util.Scanner;

/**
 * 3、在Demo类的main方法中，创建班级类对象，调用其init方法，接着循环显示菜单：
 */
public class Demo {
    public static void main(String[] args) {
        SchoolClass pr=new SchoolClass("大一","计算机专业","四班");

        pr.init();
        boolean flag=true;
        do {
            meu();
            Scanner j=new Scanner(System.in);
            int chose=j.nextInt();
            switch(chose)
            {
                case 1:
                    System.out.println("请输入学号：");
                    Scanner h=new Scanner(System.in);
                    System.out.println( pr.searchByID(h.nextLine()));
                    break;
                case 2:
                    System.out.println("请输入姓名：");
                    System.out.println( pr.searchByName(new Scanner(System.in).nextLine()));
                    break;
                case 3:
                    System.out.println("年级："+pr.getClass1()+"专业："+pr.getPro()+"班级名："+pr.getClassname());
                    System.out.println("班级所有学生信息如下");
                    pr.print();
                    break;
                case 4:
                    System.out.println("请输入要删除学生的学号");
                    System.out.println("删除结果为："+ pr.del(new Scanner(System.in).nextLine()));
                    break;
                default:
                    System.out.println("退出");
                    flag=false;

            }

        }while(flag);
    }
    public static  void meu()
    {
        System.out.println("*******************");
        System.out.println("** 1.按学号查询  ****");
        System.out.println("** 2.按姓名查询  ****");
        System.out.println("** 3.输出所有信息 ***");
        System.out.println("** 4.删除学生信息 ***");
        System.out.println("** 5.退出      ****");
        System.out.println("******************");

    }
}
