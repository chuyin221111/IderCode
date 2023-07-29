import java.io.*;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/29
 * @project java SE
 */
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.1.7",10000);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null)
        {
            if("886".equals(line))
            {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        s.close();
    }
}
