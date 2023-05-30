public class Demo {
    public static void main(String[] args) {
        Child child=new Child("小明",9,"红旗小学");
        System.out.println(child.name+",年龄为"+child.age+",在"+child.school );
        child.load();
        child.way();
    }
}
