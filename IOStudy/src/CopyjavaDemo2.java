import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @auther chuyin
 * @date 2023/6/25
 * @project java SE
 */
public class CopyjavaDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\myStream\\Circle.java");
        FileWriter fw=new FileWriter("D:\\myByteStream\\Circle.java");
      /*  int ch;
       while((ch=isr.read())!=-1)
       {
           ows.write(ch);
       }

       */
        char[] chs=new char[1024];
        int len;
        while((len=fr.read(chs))!=-1)
        {
            fw.write(chs,0,len);
        }
       fr.close();
      fw.close();
    }
}
