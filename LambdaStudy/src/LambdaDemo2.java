/**
 * @auther chuyin
 * @date 2023/8/5
 * @project java SE
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
     /*   useAddable((int x,int y)->{

            return x;
        });

      */
        //参数的类型可以省略
        useAddable(( x, y)->{

            return x+y;
        });
        //但是有多个参数的情况下，不能只省略一个
        /*useAddable(( x,int y)->{ 代码错误

            return x;
        });

         */
        //如果参数有且仅有一个，那么小括号可以省略
        useFilable( s->{
            System.out.println(s);

        });
        //如果代码块的语句只有一条，可以省略大括号和分号
        useFilable( s-> System.out.println(s));
        //如果代码块的语句只有一条，可以省略大括号和分号是前提，如果有return，return 也要省略
        useAddable(( x, y)-> x+y);
    }
    private  static void useFilable(Flyable f)
    {
        f.fly("风和日丽，晴空万里");
    }
    private static void useAddable(Addable a)
    {
        int sum=a.add(10,20);
        System.out.println(sum);
    }
}
