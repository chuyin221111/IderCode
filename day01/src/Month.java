import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        if(month==12||month==1||month==2){
            System.out.println("冬季出生");
        }
        else if(month==3||month==4||month==5){
            System.out.println("春季出生");
        }else if(month==6||month==7||month==8){
            System.out.println("夏季出生");
        }else if(month==9||month==10||month==11){
            System.out.println("秋季出生");
        }
       else{
            System.out.println("填写错误");
        }
    }
}
