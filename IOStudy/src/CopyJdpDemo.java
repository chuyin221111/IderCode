import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//复制图片
public class CopyJdpDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("D:\\myStream\\mm.jpg");
        FileOutputStream fox=new FileOutputStream("D:\\myByteStream\\mm.jpg");
        //读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        byte[] bys=new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1)
        {
            fox.write(bys,0,len);
        }
        fox.close();
        fis.close();
    }
}
