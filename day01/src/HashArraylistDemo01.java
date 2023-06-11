import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashArraylistDemo01 {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
        ArrayList<String> sm=new ArrayList<String>();
        sm.add("朱古力");
        sm.add("赵芸");
        hm.put("课外",sm);
        ArrayList<String> sp=new ArrayList<String>();
        sp.add("某某");
        sp.add("杀破狼");
        hm.put("小说",sp);
        ArrayList<String> sb=new ArrayList<String>();
        sb.add("活着");
        sb.add("生死疲劳");
        hm.put("莫言",sb);
        Set<String> keySet=hm.keySet();
        for(String key:keySet)
        {
            System.out.println(key);
            ArrayList<String> value=hm.get(key);
            for(String i:value)
            {
                System.out.println("\t"+i);
            }
        }
    }

}
