public class GennricDemo {
    public static void main(String[] args) {
        Generic<String> g1=new Genericimpl<String>();
        g1.show("kiki");
        Generic<Integer> g2=new Genericimpl<Integer>();
        g2.show(30);
    }
}
