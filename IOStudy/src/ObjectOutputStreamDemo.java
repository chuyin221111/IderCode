import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
//NotSerializableException：抛出一个实例需要一个Serializable接口。序列化运行时或实例的类可能会抛出异常
    //类的序列化由实现Java.io.Serializable接口的类启用。不实现此类接口的类将不会使任何状态序列化或反序列化
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\myStream\\oos.txt"));
        //创建对象
        Student3 s=new Student3("张三",30);
     oos.writeObject(s);
     oos.close();
    }
}
