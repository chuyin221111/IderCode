import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/28
 * @project java SE
 */
/*
   服务器：接收数据，给出反馈
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        //Socket accept():监听要连接的客户端，获取套接字
        Socket s=ss.accept();
        //获取输入流，读数据，显示在控制台
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("服务器："+data);
        //给出反馈
        OutputStream os=s.getOutputStream();
        os.write("数据已收到".getBytes());
        //释放资源

        ss.close();
    }
}
