import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
/*
   服务器：接收到的数据写入文件
 */
public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对像
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端连接，返回一个对应的Socket对象；
        Socket s=ss.accept();
        //接收数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
       //把数据写入文本文件
       // BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\s.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\Copy.java"));
        String line;
        while((line=br.readLine())!=null)
        {
           bw.write(line);
           bw.newLine();
           bw.flush();
        }
        bw.close();
        ss.close();
    }
}
