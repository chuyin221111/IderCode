import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\myStream\\fos.txt");
        //int read():从输入流读取一个字节的数据
        //第一次读取·数据
        int by=fis.read();
        System.out.println(by);
        System.out.println((char)by);
        //第二次读取数据
        by=fis.read();
        System.out.println(by);
        System.out.println((char)by);
        //如果达到文件末尾 ，则返回-1


        //释放资源
        fis.close();
    }
}
