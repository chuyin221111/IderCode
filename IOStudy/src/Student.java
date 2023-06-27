/**
 * @auther chuyin
 * @date 2023/6/27
 * @project java SE
 */
public class Student {
    String number;
    String name;

    public Student(String number,String name) {
        this.number = number;
        this.name=name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
