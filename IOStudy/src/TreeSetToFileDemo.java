import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @auther chuyin
 * @date 2023/6/28
 * @project java SE
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student1> ts=new TreeSet<Student1>(new Comparator<Student1>(){
            public int compare(Student1 s1,Student1 s2)
            {
                int num=s2.getSum()-s1.getSum();
                int num2=num==0?s1.getChinese()-s2.getChinese():num;
                int num3=num2==0?s1.getMath()-s2.getMath():num2;
                int num4=num3==0?s1.getName().compareTo(s2.getName()):num3;
                return num4;

            }
        });
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"学生信息：");
            System.out.println("姓名：");
            String name=sc.nextLine();
            System.out.println("语文成绩：");
            int chinese=sc.nextInt();
            System.out.println("数学成绩：");
            int math=sc.nextInt();
            System.out.println("英语成绩：");
            int english=sc.nextInt();
           Student1 s=new Student1();
           s.setName(name);
           s.setChinese(chinese);
           s.setMath(math);
           s.setEnglish(english);
           ts.add(s);
        }
       BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myStream\\ts.txt"));
        for(Student1 s:ts)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
