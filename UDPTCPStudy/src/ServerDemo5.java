import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
public class ServerDemo5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();
        //接收客户端的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
       //把数据写入文本文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\Copy1.java"));
        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //给出反馈
        BufferedWriter bwServer =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传");
        bwServer.newLine();
        bwServer.flush();

     br.close();
     ss.close();
    }
}
