import java.util.Properties;
import java.util.Set;

/**
 * @auther chuyin
 * @date 2023/7/3
 * @project java SE
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop=new Properties();
        prop.put("001","zhangsan");
        prop.put("002","lisi");
        prop.put("003","wangwu");
        Set<Object> keySet=prop.keySet();
        for(Object key:prop.keySet())
        {
            Object value=prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
