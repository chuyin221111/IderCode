public class StriingDemo {
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="123456";
        System.out.println(s1+s2);
        StringBuilder sb=new StringBuilder(s1);
        System.out.println( sb.append(s2));
        String s=sb.toString();
        for(char i:s.toCharArray())
        {
            System.out.print(i+"\t");
        }

    }
}
