import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther chuyin
 * @date 2023/7/3
 * @project java SE
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
       /* InputStream is=System.in;
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String line =br.readLine();
        System.out.println("你输入的字符串"+line);
        System.out.println("请输入一个整数");
        int  i=Integer.parseInt(br.readLine());
        System.out.println("你输入的整数："+i);
    }
}
