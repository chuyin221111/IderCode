import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/19
 * @project java SE
 */
public class ServerSockerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket();
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream"));
        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
     BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();
    }
}
