import java.util.Scanner;
public class Reltest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字比较");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        boolean b=x>y;
        System.out.println(x+"是不是大于"+y+":"+b);
    }
}
