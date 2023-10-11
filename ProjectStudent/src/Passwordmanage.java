/**
 * @auther chuyin
 * @date 2023/10/10
 * @project java SE
 */

import java.util.Random;
import java.util.Scanner;

/**     a23dBCD
 *      eLJk97N
设计一个简单的密码管理系统，根据特定的规则对用户输入的密码(每个字符为数字或者大小写字母，长度不超过16)进行加密和解密操作，或者判断强度、生成密码，具体功能如下：
1.加密功能Encry：用户输入一个字符串，系统根据规则对字符串进行加密：
  	（1）将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3//
  	（2）将字符串的第一位和最后一位调换顺序
  	（3）将字符串反转
2.解密功能Decry：用户输入一个字符串，按照上述规则字符串进行解密。
3.（第三周任务添加）判断密码强度Jucry：用户输入一个字符串，系统根据规则判断该密码是否为弱强度、中强度或者高强度：
  	（1）弱强度：密码长度小于8个字符，或者长度大于等于8个字符但只有一种字符类型（数字或字母）
  	（2）中强度：密码长度大于等于8个字符，并且包含至少一个数字和一个字母（可以是大小写）
  	（3）高强度：密码长度大于等于8个字符，并且包含至少一个数字、一个小写字母和一个大写字母
4. （第三周任务添加）密码生成Gecry：系统可以提供一个密码生成器，在用户设定密码长度后，帮助用户随机生成强密码并显示。
5.菜单界面meu：系统提供一个简单的菜单界面，供用户选择不同操作。用户可以通过输入菜单选项的序号来执行相应的操作。
6.错误处理Errohand：系统能够检测并处理用户输入的非法密码（字符中含有其它字符的、长度不符合要求的）或无效的菜单选项。错误消息将被显示给用户，以便提供清晰的反馈信息。
 */

public class Passwordmanage {
    public static void main(String[] args) {
		boolean flag=true;
		char[] pass;
		do
		{
			meu();
			Scanner scanner=new Scanner(System.in);
			int chose=scanner.nextInt();
			switch (chose)
			{
				case 1:
                    Encryption();break;
				case 2:
					Decry();break;
				case 3:
					Jucry();break;
				case 4:
					Gecry();break;
				case 5:
					flag=false;
				default:
					System.out.println("输入错误，请重新选择");

			}
		}while(flag);
    }
	public static void meu()
	{
		System.out.println("-------------------");
		System.out.println("  欢迎使用密码管理系统 ");
		System.out.println("-------------------");
		System.out.println("      请选择    ");
		System.out.println("     1.加密");
		System.out.println("     2.解密");
		System.out.println("     3.判断密码强度");
		System.out.println("     4.密码生成");
		System.out.println("     5.退出");
		System.out.println("--------------------");
		System.out.print("你选择的序号为：");
	}
	public static void Encryption() {
		char temp,key;
		int sum=0;
		System.out.print("请输入你要加密的密码：");
		Scanner scanner = new Scanner(System.in);
		String ps = scanner.nextLine();
		char[] password = ps.toCharArray();
		for(int y=0;y<password.length;y++)
		{
			if (password[y] < '0' && password[y] > '9' && password[y] < 'A' && password[y] > 'Z' &&password[y] < 'a' && password[y] > 'z')
			{
				sum++;
			}
		}
		if(sum>0)
		{
			System.out.println("输入非法字符，输入错误");
		}
		else if(password.length>16)
		{
			System.out.println("输入长度超过16位,输入错误");
		}
		else{
			for (int i = 0; i < password.length; i++)
			{
				password[i]= (char) (password[i]+i+1+3);
			}
			temp=password[0];
			password[0]=password[password.length-1];
			password[password.length-1]=temp;
			int j=password.length-1;
			for(int k=0;j>=k;j--,k++)
			{
				key=password[k];
				password[k]=password[j];
				password[j]=key;
			}
			System.out.print("加密后：");
			for(int h=0;h<password.length;h++)
			{
				System.out.print(password[h]);
			}
			System.out.println();
		}


	}
	public static void Decry()
	{
		char temp,key;
		int sum=0;
		System.out.print("请输入你要解密的密码：");
		Scanner scanner = new Scanner(System.in);
		String ps = scanner.nextLine();
		char[] password = ps.toCharArray();
		for(int y=0;y<password.length;y++)
		{
			if (password[y] < '0' && password[y] > '9' && password[y] < 'A' && password[y] > 'Z' &&password[y] < 'a' && password[y] > 'z')
			{
				sum++;
			}
		}
		if(sum>0)
		{
			System.out.println("输入非法字符，输入错误");
		}
		else if(password.length>16)
		{
			System.out.println("输入长度超过16位,输入错误");
		}
		else{
			int j=password.length-2;
			for(int k=1;j>=k;j--,k++)
			{
				key=password[k];
				password[k]=password[j];
				password[j]=key;
			}
			for(int i=0;i<password.length;i++)
			{
				password[i]=(char)(password[i]-i-1-3);
			}
			System.out.print("解密后：");
			for(int h=0;h<password.length;h++)
			{
				System.out.print(password[h]);
			}
			System.out.println();
		}

	}
	public static void Jucry()
	{
		int num=0,d=0,x=0;
		int sum=0;
		System.out.print("请输入你的密码：");
		Scanner scanner = new Scanner(System.in);
		String ps = scanner.nextLine();
		char[] password = ps.toCharArray();
		for(int y=0;y<password.length;y++)
		{
			if (password[y] < '0' && password[y] > '9' && password[y] < 'A' && password[y] > 'Z' &&password[y] < 'a' && password[y] > 'z')
			{
				sum++;
			}
		}
		if(sum>0)
		{
			System.out.println("输入非法字符，输入错误");
		}
		else if(password.length>16)
		{
			System.out.println("输入长度超过16位,输入错误");
		}
		else {
			if(password.length<8)
			{
				System.out.println("该密码是为弱强度");
			}
			else if(password.length>=8)
			{
				for(int i=0;i<password.length;i++)
				{
					if(password[i]>='0'&&password[i]<='9')
					{
						num++;
					}
					if(password[i]>='A'&&password[i]<='Z')
					{
						d++;
					}
					if(password[i]>='a'&&password[i]<='z')
					{
						x++;
					}
				}

				if(num>0&&d==0&&x==0)
				{
					System.out.println("该密码为弱强度");
				}
				else if(num==0&&(d>0||x>0))
				{
					System.out.println("该密码强度为弱强度");
				}
				else if((num>0&&d>0&&x==0)||(num>0&&d==0&&x>0))
				{
					System.out.println("该密码强度为中强度");
				}
				else if(num>0&&d>0&&x>0)
				{
					System.out.println("该强度为高强度");
				}
			}
		}

	}
	public static void Gecry()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你所要的密码长度：");
		int index=scanner.nextInt();
		StringBuilder sb=new StringBuilder();
		Random random=new Random();
		System.out.println("密码生成，你的密码如下：");
		for(int i=0;i<index;i++)
		{
			switch(random.nextInt(3))
			{
				case 0:
					char ranLowLetter=(char)((random.nextInt(26)+97));
					System.out.print(ranLowLetter);
					break;
				case 1:
					char ranUpLetter=(char)((random.nextInt(26)+65));
					System.out.print(ranUpLetter);
					break;
				case 2:
					int ranNumOut=random.nextInt(10);
					System.out.print(ranNumOut);
					break;
			}

		}
		System.out.println();
	}
	/**public static void  Errohand(char[]*password)
	{
		if(password.length>16)
		{
			System.out.println("该输入长度大于16，符合要求");
		}
		else {
			for(int n=0;n<password.length;n++)
			{
				if(password[n]<'0'||password[n]>'9'||password[n]<'A'||password[n]>'Z'||password[n]<'a'||password[n]>'z')
				{
					System.out.println("输入不符合规范，有其他字符");
					break;
				}
			}
	}

	 */

}
