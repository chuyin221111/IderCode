import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auther chuyin
 * @date 2023/7/25
 * @project java SE
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
       InetAddress address=InetAddress.getByName("192.168.0.3");
       // InetAddress address=InetAddress.getByName("CHUYIN");
        String name=address.getHostName();
        String IP=address.getHostAddress();
        System.out.println("主机名："+name);
        System.out.println("IP地址"+IP);
    }
}
