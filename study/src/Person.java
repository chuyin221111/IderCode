import java.io.Serializable;

/**
 * @auther chuyin
 * @date 2023/6/30
 * @project java SE
 */
/*
编写程序，完成一个简单的通讯录，实现客户信息的录入、查询，具体实现要求如下：
（1）编写Person类，实现客户信息的处理：
属性：姓名、电话号码
方法：
·构造方法，两个参数，设置属性的值。
·属性的getter、setter访问器
·重写从Object继承的toString方法，返回姓名，电话号码连接成的字符串；
 */
public class Person implements Serializable {
    private static final long serialVersionUID=24L;
    String name;
    String number;



    public Person(String name, String number) {
        this.name = name;
        this.number =number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
