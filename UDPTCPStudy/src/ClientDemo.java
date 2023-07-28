import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/17
 * @project java SE
 */
/*
   TCP发送数据的步骤
   1.创建客户端的Socket对象（Socket）
   2.获取输出流，写数据
     OutputStream
   3.释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket s=new Socket("192.168.1.7",10001);
        OutputStream os=s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("客户端："+data);


        s.close();
    }
}
