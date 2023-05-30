import java.util.Arrays;

public class Filldemo {
    public static void main(String[] args) {
        int []x=new int[5];
        x[0]=234;
        x[3]=134;
        //将数组中所有的值，进行替换填充处理
        Arrays.fill(x,200);
        //起始位置包含，结束位置不包含//1——3
        //Arrays.fill(x,1,3,200);
        System.out.println(Arrays.toString(x));
    }
}
