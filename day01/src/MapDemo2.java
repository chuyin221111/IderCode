import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");

        System.out.println(map.get("001"));
        Set<String> key=map.keySet();
        for(String i:key)
        {
            System.out.println(i);
        }

        Collection<String> values=map.values();
        for(String value:values)
        {
            System.out.println(value);
        }
        Set<String> keySet=map.keySet();
        for (String i:keySet)
        {
            String value=map.get(i);
            System.out.println(i+","+value);
        }
    }
}
