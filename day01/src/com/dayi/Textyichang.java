package com.dayi;

public class Textyichang {
    public static void main(String[] args) {
        int a=4,b=0;
        try
        {
            if(b==0)
            {
                throw new ArithmeticException("被除数为0，程序出错！");
            }
            else {
                System.out.println(+a/b);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("抛出异常为："+e);
        }
    }
}
