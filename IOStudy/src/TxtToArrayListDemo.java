import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @auther chuyin
 * @date 2023/6/26
 * @project java SE
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\myStream\\bwe.txt"));
        ArrayList<String> array=new ArrayList<String>();
        String line;
        while((line=br.readLine())!=null)
        {
            array.add(line);
        }
        br.close();
        for(String s:array)
        {
            System.out.println(s);
        }
    }
}
