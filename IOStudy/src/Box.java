/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class Box {
    private int milk;
    private boolean state=false;

    public void put(int milk) throws InterruptedException {
        if(state)
        {
            wait();
        }
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶瓶");
        state=true;
    }
    public void get()
    {  if(!state)
    {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        state=false;
    }
}
