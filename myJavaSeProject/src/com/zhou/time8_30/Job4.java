package com.zhou.time8_30;

import java.util.Scanner;

public class Job4
{
	public static void main(String[] args)
	{
		//String time = “2018-07-01”; 要求：
		//1）在控制台输入一个时间，判断格式是否如上字符串，不同则不通过
		String time = "2018-07-01";
		Scanner in=new Scanner(System.in);
		System.out.println("输入一个时间");
		String str=in.next();
		char[] charArray = str.toCharArray();
		boolean b=true;
		for (int i = 0; i< charArray.length; i++)
		{
			if(i==4||i==7)
			{
				if(charArray[i]!='-')
				{
					System.out.println("格式不通过");b=false;
					return;
				}
			}
			else if(charArray[i]=='0'||charArray[i]=='1'||charArray[i]=='2'||charArray[i]=='3'||charArray[i]=='4'||charArray[i]=='5'||charArray[i]=='6'||charArray[i]=='7'||charArray[i]=='8'||charArray[i]=='9')
			{}else {
				System.out.println("格式不通过");b=false;
				return;
			}
		}
		if(b)
		{
			System.out.println("通过");
		}
		
	}
}
