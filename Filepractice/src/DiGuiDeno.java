public class DiGuiDeno {
    public static void main(String[] args) {
        //回顾不死神兔问题，求第20个月兔子的对数
        //每个月的兔子对数：1，1，2，3，5，8
       int[] arr=new int[20];
       arr[0]=1;
       arr[1]=1;
        System.out.println(f(20));

    }
    //递归
    public static int f(int n)
    {
         if(n==1||n==2)
         {
             return 1;
         }
         return f(n-1)+f(n-2);

    }
}
