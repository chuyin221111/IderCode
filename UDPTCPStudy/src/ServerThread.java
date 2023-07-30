import java.io.*;
import java.net.Socket;

/**
 * @auther chuyin
 * @date 2023/7/30
 * @project java SE
 */
public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread (Socket s)
    {
        this.s=s;
    }
     public void run()
     {

         try {
             BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
             int count=0;
             File file=new File("D:\\myStream\\Copy[" +count+
                     "].java");
             while(file.exists())
             {
                 count++;
                 file=new File("D:\\myStream\\Copy[" +count+
                         "].java");
             }
             BufferedWriter bw=new BufferedWriter(new FileWriter(file));
             String line;
             while ((line=br.readLine())!=null)
             {
                 bw.write(line);
                 bw.newLine();
                 bw.flush();
             }
             BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
             bwServer.write("文件上传成功");
             bwServer.newLine();
             bwServer.flush();
             s.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }
}
