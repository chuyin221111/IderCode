public class StringBuliderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        //String s=sb//错误写法
        String s= sb.toString();
        System.out.println(s);
        String t="world";
       // StringBuilder sb2=t;///错误写法
        StringBuilder sb2=new StringBuilder(t);
        System.out.println(sb2);
    }
}
