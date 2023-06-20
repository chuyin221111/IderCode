import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther chuyin
 * @date 2023/6/20
 * @project java SE
 */
public class BufferedDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bis=new BufferedOutputStream(new FileOutputStream("D:\\myStream\\fos.txt"));
        bis.write("hellq\n".getBytes());
        bis.write("world\n".getBytes());
        bis.close();
    }
}
