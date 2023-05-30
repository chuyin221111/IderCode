public class Textst {
    public static void main(String[] args) {
            int a[]={25,24,12,76,98,101,90,28};
            int i,j,temp;
            for(i=0;i<a.length;i++)
            {
                for(j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
       for(i=0;i<a.length;i++)
       {
           System.out.print("a["+i+"]="+a[i]+",\t");
       }

    }
}
