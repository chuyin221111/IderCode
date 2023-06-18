import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamemo04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("D:\\myStream\\fos.txt");
            fos.write("hello".getBytes());
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
            if(fos!=null) {
                try{
                    fos.close();
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

}
