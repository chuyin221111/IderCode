import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("172.22.188.179");
        String name=address.getHostName();
        String ip=address.getHostAddress();
        System.out.println("主机名"+name);
        System.out.println("Ip地址"+ip);

    }
}
