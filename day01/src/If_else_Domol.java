import java.util.Scanner;

public class If_else_Domol {
    public static void main(String[] args) {
        double d=Math.random();  //0~1的随机小数
        d=d*3;
        int x=(int)d;
        System.out.println("欢迎来到猜硬币游戏");
        System.out.println("请猜正反面 0正面 1反面");
        Scanner scanner=new Scanner(System.in);
        int u=scanner.nextInt();
        if(x==u) {
            System.out.println("猜对了");
        }else{
            System.out.println("猜错了");
        }

    }
}
