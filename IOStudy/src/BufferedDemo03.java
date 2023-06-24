import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @auther chuyin
 * @date 2023/6/21
 * @project java SE
 */
public class BufferedDemo03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //[97, 98, 99]
     String s="abc";
     byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));
        System.out.println("------------");
        //[-28, -72, -83, -27, -101, -67]
        String s1="中国";
        byte[] bys1=s1.getBytes();
        System.out.println(Arrays.toString(bys1));
        System.out.println("-------------");
        String s2="中国";
        //[-28, -72, -83, -27, -101, -67]
        byte[] bys2=s2.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys2));
        System.out.println("-----------------");
        String s3="中国";
        //[-42, -48, -71, -6]
        byte[] bys3=s3.getBytes("GBK");

        System.out.println(Arrays.toString(bys3));


    }
}
