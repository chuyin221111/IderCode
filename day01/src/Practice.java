import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i=scanner.nextInt();
        boolean b=i%2==0;
        if(b){
            System.out.println("是偶数");
        }

    }
}
