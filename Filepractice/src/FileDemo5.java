import java.io.File;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args)throws IOException {
       // File f1=new File("java.txt");
      //  System.out.println(f1.createNewFile());
        //System.out.println(f1.delete());
        //System.out.println("------");
        //在当前模块目录下创建Java.txt
        File f1=new File("myFile\\java.txt");

        //删除当前模块目录下的Java.txt文件
        System.out.println(f1.delete());
        //在当前模块目录下的创建itcast目录
       // File f2=new File("myFile\\itcast");
       // System.out.println(f2.mkdir());
       // System.out.println(f2.delete());
        System.out.println("------");
        //在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
       // File f4=new File("myFile\\itcast\\java.txt");
        //System.out.println(f4.createNewFile());报错，原因为上级目录不存在，然后就报异常
        File f3=new File("myFile\\itcast");
        //System.out.println(f3.mkdir());
        File f4=new File("myFile\\itcast\\java.txt");
       // System.out.println(f4.createNewFile());
        //删除当前模块下的目录itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete());



    }
}
