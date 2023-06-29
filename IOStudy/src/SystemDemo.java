import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther chuyin
 * @date 2023/6/29
 * @project java SE
 */
public class SystemDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String line=isr.readLine();
        System.out.println("你输入的字符串："+line);
        System.out.println();
        System.out.println("请输入一个整数：");
        int i=Integer.parseInt(isr.readLine());
        System.out.println("你输入的整数："+i);
    }

}
