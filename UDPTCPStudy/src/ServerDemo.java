import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/17
 * @project java SE
 */
/*
   TCP接收数据的步骤
   1.创建服务器端的Socket对象（ServerSocket）
   2.监听客户端连接，返回一个Socket对象
   3.获取输入流，读数据，并把数据显示在控制台
   4.释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端
        //直接创建Socket对象，不能形成虚拟链路
        ServerSocket ss=new ServerSocket(10001);
        //Socket accept():监听要连接的客户端，获取套接字
        Socket s=ss.accept();
        //获取输入流，读数据，显示在控制台
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("服务器："+data);
        //释放资源
        s.close();
        ss.close();
    }
}
