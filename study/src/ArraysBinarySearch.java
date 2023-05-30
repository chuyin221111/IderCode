import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int []x={12,23,34,54,21,18,67};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int i=Arrays.binarySearch(x,23);
        System.out.println(i);
    }
}
