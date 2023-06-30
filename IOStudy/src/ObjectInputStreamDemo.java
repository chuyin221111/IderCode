import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\myStream\\oos.txt"));
        //Object  readObject():从ObjectInputStream读取一个对象
        Object obj=ois.readObject();
        //Object是父类，子类获取父类对象要向下装型
        Student3 s=(Student3)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
