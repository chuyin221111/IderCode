import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @auther chuyin
 * @date 2023/7/3
 * @project java SE
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array=new ArrayList<>();
        array.add("hellow");
        array.add("world");
        array.add("java");
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\arrray.txt"));
        for(String s:array)
        {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
