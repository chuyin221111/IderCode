import java.util.Scanner;

public class Practicing {
    public static void main(String[] args) {
        //从键盘接收
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double d=scanner.nextDouble();
        //int x=scanner.nextInt();//从键盘接收一个整数
        System.out.println("请输入第二个数字");
        double y=scanner.nextDouble();
        double z=d+y;
        System.out.println("计算结果");
        System.out.println(z);
    }
}