import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //复制文本文件
        //根据数据源创建字节输入流对象
        FileInputStream fis=new FileInputStream("D:\\myStream\\心理报告.doc");
        //根据目的地创建字节输出流对像
        FileOutputStream fos=new FileOutputStream("D:\\myByteStream\\心理报告.doc");
        //读取数据，复制文件文本（一次读取一个字节，一次写入一个字节）
        int by;
        while((by=fis.read())!=-1)
        {
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
