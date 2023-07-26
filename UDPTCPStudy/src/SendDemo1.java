import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @auther chuyin
 * @date 2023/7/18
 * @project java SE
 */
/*
  UDP发送数据
   数据来自于键盘录入，直到输入的数据是866，发送数据结束
 */
public class SendDemo1 {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象（DatagramSocket）
        DatagramSocket ds=new DatagramSocket();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //自己封装键盘录入数据
        String line;
        while((line=br.readLine())!=null) {    //输入的数据是886，发送数据结束
            if ("886".equals(line))
            {
                break;
            }
             byte[] bys=line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.7"), 12345);
          ds.send(dp);
        }
            ds.close();
    }
}
