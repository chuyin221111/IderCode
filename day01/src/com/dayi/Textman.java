package com.dayi;
//1——100的自然数求和
public class Textman {
    public static void main(String[] args) {
      int sum=0,i=0,d=0,a=0,r=0,temp=0;
      for(i=0;i<=100;i++)
      {
          sum+=i;
      }
        System.out.println(sum);
        System.out.println("-----------");
        do {

            d+=a;
            a++;
        }while(a<=100);
        System.out.println(d);
        System.out.println("------------------");
        while(r<=100)
        {
            temp+=r;
            r++;
        }
        System.out.println(temp);
    }
}
