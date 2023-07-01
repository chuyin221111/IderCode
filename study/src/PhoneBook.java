import java.io.*;
import java.util.ArrayList;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
/*
（2）编写PhoneBook（电话本）类：
属性：phoneList（Person类类型的ArrayList列表，存储多个Person信息）
方法：
·构造方法，无参，创建空列表
·构造方法，1个参数n，创建列表，调用input方法输入并在列表中插入n个Person对象。
·input()：使用InputStreamReader、BufferedReader方法实现姓名、电话信息的输入，并创建一个Person对象，插入到phoneList中。
·searchByName(String name):根据输入的姓名查询phoneList，返回找到的电话号码，否则返回null；
·searchByPhone(String phone):根据输入的电话号码查询phoneList，返回找到的Person对象，否则返回null；
·writeFile(String filename)：遍历phoneList，调用每个Person的toString方法，获得姓名、电话串，输出到文本文件“phone.txt”中。
·print()：把phoneList中的所有信息输出。
·exportList(String filename)：使用对象序列化方法，把phoneList输出到文件
·importList(String filename)：使用对象序列化方法，从文件中读取内容加载phoneList。
· deleteByName(String name)：根据输入的姓名查询phoneList，删除指定的Person对象，若删除成功返回true，否则返回false。
 */
public class PhoneBook {
    ArrayList<Person> phoneList;
    public PhoneBook() {
        phoneList=new ArrayList<>();
    }

    public PhoneBook(int n) throws IOException {
        phoneList=new ArrayList<>();
        input(n);
    }

    public void input(int n) throws IOException {

        for(int i=0;i<n;i++)
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入姓名：");
            String line=br.readLine();
            System.out.println("请输入电话号码：");
            String m=br.readLine();
            Person p=new Person(line,m);
            phoneList.add(p);
        }
    }
    public String searchByName(String name)
    {
        for(Person s:phoneList)
        {
            if(name.equals(s.getName()))
            {
                return s.getNumber();
            }
        }
        return null;
    }
    public  String seachByPhone(String number)
    {
        for(Person h:phoneList)
        {
            if(number.equals(h.getNumber()))
            {
                return h.getName();
            }
        }
        return null;
    }
    public void writerFile(String Filename) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter(Filename));

        for(Person s:phoneList)
        {
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
    public void print()
    {
        for(Person s:phoneList)
        {
            System.out.println("姓名："+s.getName()+",电话号码："+s.getNumber());
        }
    }
    public void exportList(String filename) throws IOException {
        ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream(filename));
        for(Person h:phoneList)
        {
            ois.writeObject(h);
        }
        ois.close();
    }

    public void importList(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream(filename));
        for(int i=0;i<phoneList.size();i++)
        {
            Object obj=oos.readObject();
            Person s=(Person)obj;
            System.out.println(s.getName()+","+s.getNumber());
        }
        oos.close();
    }
    public boolean deleteByNAMe(String name)
    {
        for(Person h:phoneList)
        {
            if(name.equals(h.getName()))
            {
                return phoneList.remove(h);
            }

        }
        return false;
    }
}
