/**
 * @auther chuyin
 * @date 2023/7/20
 * @project java SE
 */
public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int x,int y)->{

            return x;
        });
    }
    private static void useAddable(Addable a)
    {
        int sum=a.add(10,20);
        System.out.println(sum);
    }
}
