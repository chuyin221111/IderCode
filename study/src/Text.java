public class Text {
    public static void main(String[] args) {
        Student student=new Student("杜甫","男");
        Student student1=new Student("李清照","女");
        Teacher teacher=new Teacher();
        teacher.sign(student);
        teacher.sign(student1);
    }
}
