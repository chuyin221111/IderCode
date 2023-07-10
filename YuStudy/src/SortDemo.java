import java.util.Arrays;

/**
 * @auther chuyin
 * @date 2023/7/10
 * @project java SE
 */
public class SortDemo {
    public static void main(String[] args) {
        int []x={12,34,54,24,76,67};
        //数组进行排序的处理 快速排序
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int i=Arrays.binarySearch(x,54);
        System.out.println(i);
    }
}
