import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/28
 * @project java SE
 */
/*
  客户端：发送数据，接收服务器反馈
 */
public class ClientDemoc2 {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket s=new Socket("192.168.1.7",10000);
        OutputStream os=s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        //接收服务器反馈
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("客户端："+data);
       //释放资源
        s.close();
    }
}
