import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @auther chuyin
 * @date 2023/6/23
 * @project java SE
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //byte[] getBytes():使用平台的默认字符集将String编码为一系列字节，将结果存储到新的字节数组中
        String s="中国";
        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));
        String ss=new String(bys);
      //  String ss=new String(bys,"GBK");
        System.out.println(ss);
    }
}
