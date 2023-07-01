import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
/**
编写程序，完成一个简单的通讯录，实现客户信息的录入、查询，具体实现要求如下：
（1）编写Person类，实现客户信息的处理：
属性：姓名、电话号码
方法：
·构造方法，两个参数，设置属性的值。
·属性的getter、setter访问器
·重写从Object继承的toString方法，返回姓名，电话号码连接成的字符串；
（2）编写PhoneBook（电话本）类：
属性：phoneList（Person类类型的ArrayList列表，存储多个Person信息）
方法：
·构造方法，无参，创建空列表
·构造方法，1个参数n，创建列表，调用input方法输入并在列表中插入n个Person对象。
·input()：使用InputStreamReader、BufferedReader方法实现姓名、电话信息的输入，并创建一个Person对象，插入到phoneList中。
·searchByName(String name):根据输入的姓名查询phoneList，返回找到的电话号码，否则返回null；
·searchByPhone(String phone):根据输入的电话号码查询phoneList，返回找到的Person对象，否则返回null；
·writeFile(String filename)：遍历phoneList，调用每个Person的toString方法，获得姓名、电话串，输出到文本文件“phone.txt”中。
·print()：把phoneList中的所有信息输出。
·exportList(String filename)：使用对象序列化方法，把phoneList输出到文件
·importList(String filename)：使用对象序列化方法，从文件中读取内容加载phoneList。
· deleteByName(String name)：根据输入的姓名查询phoneList，删除指定的Person对象，若删除成功返回true，否则返回false。
（3）编写Demo类
创建PhoneBook类对象并进行初始化，接着循环显示菜单：
***************************  *************************************
1、录入信息；2、按姓名查询；3、按电话号码查询；4、写文件；5、输出信息；6、删除信息；7、导出列表；8、导入列表；0、退出
*********************************************************************
根据用户的选择调用相应的PhoneBook类的方法进行操作。
 */
public class DDemo   {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       File file=new File("D:\\myStream\\phone.txt");
       file.createNewFile();
        PhoneBook p=new PhoneBook();
        boolean flag=true;
       do {
           meu();
           System.out.println("请输入你的选择");
           Scanner y=new Scanner(System.in);
           int chose=y.nextInt();
           switch (chose)
           {
               case 1:
                   System.out.println("请输入联系人的人数");
                   Scanner g=new Scanner(System.in);
                   p.input(g.nextInt());
                   break;
               case 2:
                   System.out.println("请输入你要查询的姓名：");
                   Scanner o=new Scanner(System.in);
                   String number1=p.searchByName(o.nextLine());
                   System.out.println("电话号码是"+number1);
                   break;
               case 3:
                   System.out.println("请输入你要查询的电话号码：");
                   Scanner u=new Scanner(System.in);
                   String name1=p.seachByPhone(u.nextLine());
                   System.out.println("姓名是"+name1);
                   break;
               case 4:
                   p.writerFile(file.getName());
                   break;
               case 5:
                   p.print();
                   break;
               case 7:
                   p.exportList(file.getName());
                   break;
               case 8:
                   p.importList(file.getName());
                   break;
               case 6:
                   System.out.println("请输入你要删除的姓名：");
                   Scanner w=new Scanner(System.in);
                  boolean delete=p.deleteByNAMe(w.nextLine());
                   System.out.println("删除结果是"+delete);
                  break;
               default:
                   System.out.println("退出");
                    flag=false;

           }
       }while(flag);
    }
    public static void meu()
    {
        System.out.println("******************");
        System.out.println("*   1.录入信息     *");
        System.out.println("*   2.按姓名查询    *");
        System.out.println("*  3.按电话号码查询  *");
        System.out.println("*   4.写文件       *");
        System.out.println("*   5.输出信息      *");
        System.out.println("*   6.删除信息      *");
        System.out.println("*   7.导出列表      *");
        System.out.println("*   8.导入列表      *");
        System.out.println("*   0.退出         *");
        System.out.println("*******************");
    }
}
