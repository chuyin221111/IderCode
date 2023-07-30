import java.io.*;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
public class ClientDemo5 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.1.7",10000);
        //数据来自于文本文件
        BufferedReader br=new BufferedReader(new FileReader("D:\\myStream\\InetAddressDemo.java"));
        //给服务器发送文本文件
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //public void shutdownOutput 是把输出流断了，发了一个中断输出的信号，告诉服务器无了，并不是关闭连接
        s.shutdownOutput();
        BufferedReader brClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=brClient.readLine();
        System.out.println("服务器的反馈"+data);
        br.close();
        s.close();
    }
}
