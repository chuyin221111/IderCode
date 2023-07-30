import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
public class ServerDemo6 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
       while(true)
       {
           Socket s=ss.accept();
           new Thread(new ServerThread(s)).start();
       }

    }
}
