import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @auther chuyin
 * @date 2023/6/25
 * @project java SE
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\myStream\\osw.txt"));
        osw.write(97);
        //不用刷新流是不能直接写进文件里，因为文件是给字节流，而这个是字符流
       osw.flush();
        osw.write(98);
        osw.flush();
        osw.write(99);
       /* char[] chs={'a','b','c','d','e'};
        //osw.write(chs);
       // osw.write(chs,0,chs.length);
        //osw.write(chs,1,3);
        //osw.write("abcdef");
        osw.write("abcdef",2,4);*/
       osw.close();

    }
}
