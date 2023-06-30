import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
/*
用对象序列化流序列化一个对象后，假如我们修改了对象所属文件，读取数据会不会出问题？
   java.io.InvalidClassException:
   当序列化运行时检测到一个类中的下列问题之一时抛出。
     类的串行版本与从流中读取的类的不匹配
     该类包含未知的数据类型
     该类没有一个可访问的无参数构造函数

   Student3; local class incompatible:
   stream classdesc serialVersionUID = -1630375945430184119,
    local class serialVersionUID = 2120923425741261216
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\myStream\\oos.txt"));

        Object obj=ois.readObject();

        Student3 s=(Student3)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
    private static void write() throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\myStream\\oos.txt"));

        Student3 s=new Student3("张三",30);
        oos.writeObject(s);
        oos.close();
    }
}
