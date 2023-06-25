import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther chuyin
 * @date 2023/6/25
 * @project java SE
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\myStream\\osw.txt"));
       /* int ch;
        while((ch= isr.read())!=-1)
        {
            System.out.println((char)ch);
        }
        isr.close();

        */
        char[]chs=new char[1024];
        int len;
        while((len= isr.read(chs))!=-1)
        {
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
