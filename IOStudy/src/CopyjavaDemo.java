import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/25
 * @project java SE
 */
public class CopyjavaDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\myStream\\fos.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\myByteStream\\fos1.txt"));
       /* int ch;
        while((ch= isr.read())!=-1)
        {
            osw.write(ch);
        }

        */
        char[]chs=new char[1024];
        int len;
        while((len= isr.read(chs))!=-1)
        {
            osw.write(chs,0,len);
        }
        isr.close();
        osw.close();
    }
}
