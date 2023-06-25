import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/24
 * @project java SE
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter ows=new OutputStreamWriter(new FileOutputStream("D:\\myStream\\osw.txt"),"GBK");
        ows.write("中国");
        ows.close();
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\myStream\\osw.txt"),"GBK");
        int ch;
        while((ch=isr.read())!=-1)
        {
            System.out.print((char)ch);
        }
        isr.close();
    }
}
