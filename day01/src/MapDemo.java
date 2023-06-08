import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("itheima001","张三");
        map.put("itheima002","张三");
        map.put("itheima003","张三");
        System.out.println(map);
        System.out.println(map.remove("itheima001"));
        System.out.println(map.remove("itheima004"));
        map.clear();
    }

}
