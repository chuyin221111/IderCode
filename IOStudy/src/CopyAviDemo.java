import java.io.*;

/**
 * @auther chuyin
 * @date 2023/6/22
 * @project java SE
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        long starTime=System.currentTimeMillis();
       // method1();
        //method2();
       // method3();
        method4();
        long endTime=System.currentTimeMillis();
        System.out.println("共耗时"+(endTime-starTime)+"毫秒");

    }
    //字节流缓冲流一次读写一个字节数组  共耗时1毫秒
    public static void method4() throws IOException {
        BufferedInputStream fis=new BufferedInputStream(new FileInputStream("D:\\myStream\\字节流复制图片.mp4"));
        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("D:\\myByteStream\\字节流复制图片.mp4"));
        byte[]bys=new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1)
        {
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
    //字节缓冲流一次读写一个字节 共耗时19毫秒
    public static void  method3() throws IOException {
        BufferedInputStream fis=new BufferedInputStream(new FileInputStream("D:\\myStream\\字节流复制图片.mp4"));
        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("D:\\myByteStream\\字节流复制图片.mp4"));
        int by;
        while((by=fis.read())!=-1)
        {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
    //基本字节流一次读写一个字节数组 共耗时3毫秒
    public static void method2() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\myStream\\字节流复制图片.mp4");
        FileOutputStream fos=new FileOutputStream("D:\\myByteStream\\字节流复制图片.mp4");
        byte[] bys=new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1)
        {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
    //基本字节流一次读写一次  共耗时2384毫秒
    public static void method1() throws IOException {
        //复制视频
        FileInputStream fis=new FileInputStream("D:\\myStream\\字节流复制图片.mp4");
        FileOutputStream fos=new FileOutputStream("D:\\myByteStream\\字节流复制图片.mp4");
        int by;
        while((by=fis.read())!=-1)
        {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
