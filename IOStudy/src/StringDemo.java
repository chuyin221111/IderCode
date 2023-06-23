import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @auther chuyin
 * @date 2023/6/23
 * @project java SE
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));
        String ss=new String(bys);
      //  String ss=new String(bys,"GBK");
        System.out.println(ss);
    }
}
