/**
 * @auther chuyin
 * @date 2023/7/2
 * @project java SE
 */
/**
1、学生类Student
私有属性：学号，姓名、专业；
公有构造方法1：无参构造方法；
公有构造方法2：一个参数为学号，给属性赋值；
公有方法：
学号的getter访问器；其他所有属性的getter和setter访问器；
重写从Object继承的toString方法，返回学号，姓名、专业连接成的字符串；

3、在Demo类的main方法中，创建班级类对象，调用其init方法，接着循环显示菜单：
 */
public class Student {
    String number;
    String name;
    String pro;
    public Student()
    {

    }
    public Student(String name)
    {
        this.name=name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", pro='" + pro ;
    }
}
