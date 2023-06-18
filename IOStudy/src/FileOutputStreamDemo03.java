import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fox=new FileOutputStream("D:\\myStream\\fox.txt",true);
       for(int i=0;i<10;i++)
       {
           fox.write("hello".getBytes());
           fox.write("\n".getBytes());
       }
       /*字节流写数据如何实现追加写入呢？
        public FileOutputStream (String name,boolean append):
        创建文件输出流以指定的名称写入文件。
        如果第二个参数为true，则字节将写入文件的末尾而不是开头
        true:创建对象不会覆盖源文件，继续在文件末尾追加写数据
        false:创建一个新文件，覆盖源文件
        */
       fox.close();
    }
}
