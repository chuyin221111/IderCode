

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther chuyin
 * @date 2023/6/20
 * @project java SE
 */
public class BufferedDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream box=new BufferedInputStream(new FileInputStream("D:\\myStream\\fos.txt"));
        //一次读取一个字节
       /* int by;
        while((by=box.read())!=-1)
        {
            System.out.print((char)by);
        }*/
        //一次读取一个字节数组数据
        byte[] bys=new byte[1024];
        int len;
        while((len= box.read())!=-1)
        {
            System.out.println(new String(bys,0,len));
        }
    }
}
