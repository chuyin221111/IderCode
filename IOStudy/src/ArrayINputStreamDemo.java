import java.io.*;
import java.util.ArrayList;

/**
 * @auther chuyin
 * @date 2023/6/27
 * @project java SE
 */
public class ArrayINputStreamDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array=new ArrayList<Student>();
        Student s1=new Student("002","张三");
        Student s2=new Student("003","李四");
        Student s3=new Student("004","王五");
        array.add(s1);
        array.add(s2);
        array.add(s3);
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\student.txt"));
        for(Student s:array)
        {
            StringBuilder  sb=new StringBuilder();
            sb.append(s.getNumber()).append(",").append(s.getName()).append("。");
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        BufferedReader br=new BufferedReader(new FileReader("D:\\mySTream\\Student.txt"));
        String len;
        while((len=br.readLine())!=null)
        {
            System.out.println(len);
        }
    }
}
