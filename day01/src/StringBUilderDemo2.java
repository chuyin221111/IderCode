public class StringBUilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=sb.append("hello");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println(sb==sb2);
        //链式编程
        sb.append("hello").append("world").append(100);
        System.out.println("sb:"+sb);

        sb.reverse();
        System.out.println("sb:"+sb);

    }
}
