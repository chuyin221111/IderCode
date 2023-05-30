

public class StudentDemo {
    public static void main(String[] args) {
        Student w=new Student("24","lisi");
        Student s= new Student("30","zhangsan","nan","siban");
        System.out.println(w.number+","+w.name);
        System.out.println(s.number+","+s.name+","+s.sex+","+s.cl);

    }

}
