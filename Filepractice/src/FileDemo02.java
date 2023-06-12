import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {

        File f1=new File("D:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("D:\\itcast\\javaSE");
        System.out.println(f2.mkdir());
        System.out.println("----------");
        File f3=new File("D:\\itcast\\javaWEB\\HTML");
        System.out.println(f3.mkdirs());


    }
}
