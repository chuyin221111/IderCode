import java.util.Properties;
import java.util.Set;

/**
 * @auther chuyin
 * @date 2023/7/3
 * @project java SE
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties pro=new Properties();
        pro.setProperty("001","zhangsan");
        pro.setProperty("002","lisi");
        pro.setProperty("003","wangwu");
       // System.out.println(pro.getProperty("001"));
        Set<String> names=pro.stringPropertyNames();
        for(String key:names)
        {

            String value=pro.getProperty(key);
            System.out.println(key+","+value);
        }
        //System.out.println(pro);
    }
}
