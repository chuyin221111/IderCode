import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
public class ServerDem03 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
        ss.close();
    }
}
