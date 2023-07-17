import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/17
 * @project java SE
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("172.22.188.179",10000);
        OutputStream os=s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("客户端："+data);
        s.close();
    }
}
