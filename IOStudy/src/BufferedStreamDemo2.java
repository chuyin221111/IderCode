import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/26
 * @project java SE
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\bwe.txt"));
        for(int i=0;i<10;i++)
        {
            bw.write("hello"+i);
            bw.write("\n");
           bw.newLine();
            bw.flush();

        }
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader("D:\\myStream\\bwe.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
    }
}
