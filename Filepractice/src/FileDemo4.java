import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\myFile\\java.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("---------------");
        File f2=new File("D:\\itcast");
        String [] strArray=f2.list();
        //这个只能得到文件，不能得到目录
        for (String s:strArray)
        {
            System.out.println(s);
        }
        System.out.println("---------");
        File[] fileArray=f2.listFiles();
        for(File file:fileArray)
        {
           // System.out.println(file);
            //只需要目录
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
}
