import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int []x={12,23,34,54,56,32,51};
        int []y= Arrays.copyOf(x,10);//如果源数组长度没有那么长，用0做填充
        System.out.println(Arrays.toString(y));
        int [] z=Arrays.copyOfRange(x,1,5);
        System.out.println(Arrays.toString(z));
        int[] m=new int[4];
        //参数1：源数组  参数2：从源数组哪个下标开始复制  参数3：复制到都目标数组
        //参数4：从目标数组的哪个下标位置开始放入  参数5：复制源数组多长
        System.arraycopy(x,1,m,0,4);
        System.out.println(Arrays.toString(m));
    }
}
