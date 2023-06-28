/**
 * @auther chuyin
 * @date 2023/6/28
 * @project java SE
 */
public class Student1 {
    String name;
    int chinese;
    int math;
    int english;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public int getSum()
    {
        return this.chinese + this.math + this.english;
    }
}
