import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String, String>>();
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("001","张三");
        hm.put("002","李四");
        hm.put("003","王五");
        array.add(hm);
        HashMap<String,String> hm1=new HashMap<String,String>();
        hm1.put("004","行伍");
        hm1.put("005","张氏");
        array.add(hm1);
        for(HashMap<String,String> i:array)
        {
            System.out.println(i);
        }
        System.out.println("------------");
        for(HashMap<String,String> j:array)
        {
            Set<String> keySet=j.keySet();
            for(String k:keySet)
            {
                String value=j.get(k);
                System.out.println(k+","+value);
            }
        }
    }
}
