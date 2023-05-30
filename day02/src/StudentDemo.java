import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo {
    public static void main(String[] args) {
        Collection<Student> c=new ArrayList<Student>();
        Student s1=new Student("张三",78);
        Student s2=new Student("里斯",30);
        Student s3=new Student("小品",50);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator<Student> it=c.iterator();
        while(it.hasNext())
        {
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
