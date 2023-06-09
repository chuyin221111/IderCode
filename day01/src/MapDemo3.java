import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for(Map.Entry<String,String> me:entrySet)
        {
            String key=me.getKey();
            String value=me.getValue();
            System.out.println(key+","+value);
        }

    }
}
