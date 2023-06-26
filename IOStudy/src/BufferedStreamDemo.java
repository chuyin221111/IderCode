import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @auther chuyin
 * @date 2023/6/26
 * @project java SE
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
     /*   BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\bw.txt"));
        bw.write("hello\n");
        bw.write("javaee");
        bw.close();

      */
        BufferedReader br=new BufferedReader(new FileReader("D:\\myStream\\bw.txt"));
        /*int ch;
        while((ch=br.read())!=-1)
        {
            System.out.print((char)ch);
        }

         */
        char [] chs=new char[1024];
        int len;
        while((len=br.read(chs))!=-1)
        {
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}
