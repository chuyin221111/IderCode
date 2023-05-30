public class Student {
    String number;
    String name;
    String sex;
    String cl;

    public Student(String number,String name) {
        this.number = number;
        this.name = name;
    }

    public Student(String number,String name,String sex,String cl) {
        this.number = number;
        this.name = name;
        this.sex  = sex;
        this.cl= cl;

    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

}
