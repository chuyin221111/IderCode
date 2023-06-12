import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //"D:\\itcast\\java.txt仅仅表示路径的抽象形式，并没有说这个文件存在
        File f1=new File("D:\\itcast\\java.txt");
        //file重写toStirng方法
        System.out.println(f1);
        File f2=new File("D:\\itcast","java.txt");
        System.out.println(f2);
        File f3=new File("D:\\itcast");
        File f4=new File(f3,"java.txt");
        System.out.println(f4);
    }
}
