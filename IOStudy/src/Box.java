/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class Box {
    private int milk;
    public void put(int milk)
    {
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶瓶");
    }
    public void get()
    {
        System.out.println("用户拿到第"+this.milk+"瓶奶");
    }
}
