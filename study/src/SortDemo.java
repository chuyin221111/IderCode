import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int []x={12,34,54,24,76,67};
        //数组进行排序的处理 快速排序
        Arrays.sort(x);
        for(int i:x)
        {
            System.out.println(i+"\t");
        }
    }
}
