public class Text {
    public static void main(String[] args) {
        int i,min,max;
        int a[]={7,65,58,98,12,31};
        min=max=a[0];
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("数组的最大值为；"+max);
        System.out.println("数组的最小值为："+min);
    }
}
