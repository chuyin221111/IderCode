import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @auther chuyin
 * @date 2023/7/3
 * @project java SE
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
    //  myStore();
      //把文件中的数据加载到集合
        myLoad();

    }
    private static void myLoad() throws IOException {
        Properties prop=new Properties();
        FileReader fr=new FileReader("D:\\myStream\\fwr.txt");
        //void load(Reader reader)
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
    private static void myStore() throws IOException {
        Properties prop=new Properties();
        prop.put("001","zhangsan");
        prop.put("002","lisi");
        prop.put("003","wangu");
        FileWriter fw=new FileWriter("D:\\myStream\\fwr.txt");
        //void store(Writer writer,String comments):comments表示描述该fw
        prop.store(fw,null);
        fw.close();
    }
}
