import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @auther chuyin
 * @date 2023/7/16
 * @project java SE
 */

/**
 * UDP发送数据步骤
 * 1.创建发送端的Socket对象（DatagramSocket）
 * 2.创建数据，并把数据打包
 * 3.调用DatagramSocket对象的方法发送数据
 * 4.关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socket对象（DatagramSocket）
        //DatagramSocket() 构造数据报套接字并将其绑到本地主机上的任何可用端口
        DatagramSocket ds=new DatagramSocket();
        //.创建数据，并把数据打包
        //DatagramPacket(byte[] buf,int length,InetAddress address, int port)
        //构造一个数据包，发送长度为length的数据包到指定主机上的指定端口号
        byte[] bys="hello,udp,我来了".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.0.3"),10086);
        ds.send(dp);
        ds.close();
    }
}
