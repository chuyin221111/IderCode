import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WeatherDemo {
    public static void main(String[] args) {
        ArrayList<Weather> p1=new ArrayList<>();
       Scanner scanner=new Scanner(System.in);
        System.out.println("请输入天数");
       int n= scanner.nextInt();
      //使用for
        for(int i = 0; i<n; i++)
        {
          new Weather().print();
        }
        System.out.println("-------------------------");
    //创建n个匿名对象，并添加到ArrayList集合中
        for(int i=0;i<n;i++)
      {
          p1.add(new Weather());

      }
        //使用增强for遍历
        for(Weather j:p1)
        {
           j.print();
        }
        System.out.println("-----------------");
        //使用迭代器遍历
        Iterator<Weather> s=p1.iterator();
        while(s.hasNext())
        {
         Weather h=s.next();
         h.print();
        }
        System.out.println("------------------");
        //遍历列表，统计列表对象中comfortable的天数
        int g=0;
        for(Weather j:p1)
        {
            boolean box= j.isComfortable(j.temperature, j.humidity);
            if(box)
            {
                g++;
            }
        }
        System.out.println("有"+g+"天适合comfortable");
    }

}
