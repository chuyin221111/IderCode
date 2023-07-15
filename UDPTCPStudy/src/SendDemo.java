import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @auther chuyin
 * @date 2023/7/16
 * @project java SE
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bys="hello,udp,我来了".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("172.22.188.179"),10086);
        ds.send(dp);
        ds.close();
    }
}
