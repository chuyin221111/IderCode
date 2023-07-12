import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 * @auther chuyin
 * @date 2023/7/12
 * @project java SE
 */
public class FileDemo6 {
    public static void main(String[] args) throws IOException {
       File fi=new File("D:\\myStream\\byb.txt");
        System.out.println( fi.createNewFile());
        FileInputStream fis=new FileInputStream(fi.getName());
        FileOutputStream fos=new FileOutputStream(fi.getName());
        byte [] by="abce".getBytes();
        fos.write(by,1,2);
        int be;
        while((be=fis.read())!=-1)
        {
            System.out.println((char)be);
        }
        fos.close();
    }
}
