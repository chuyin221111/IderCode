import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/28
 * @project java SE
 */
public class CopyFoiderDemo {
    public static void main(String[] args) throws IOException {
        //创建数据源目录File对象，路径是D:\myStream
        File src=new File("D:\\myStream");
        //获取数据源目录File对象的名称
        String srcName=src.getName();
        //创建目的地目录File对象，路径名是模块名+myStream组成（myByteStream\\myStream
        File des=new File("D:\\myByteStream",srcName);
        //判断目的地目录对应File是否存在，如果不存在，就创建
        if(!des.exists())
        {
            des.mkdir();
        }
        //获取数据源目录下所有文件的File数组
        File[] listFiles=src.listFiles();
        //遍历File数组，得到每一个File对象，其实就是数据源文件
        for(File srcFile:listFiles)
        {  //数据源文件：D:\\myStream\\mn.jpg
            //获取数据源文件FIle对象名称
            String srcFileName=srcFile.getName();
            //创建目的地文件File对象，路径名是目的地目录+mn.jpg组成（myByteStream\\myStream\\mn.jpg）
            File destFile=new File(des,srcFileName);
            //复制文件
            copyFile(srcFile,destFile);
        }

    }
    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FilterOutputStream(new FileOutputStream(destFile)));
    byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1)
        {
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
