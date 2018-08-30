package com.zhou.time8_30;

public class Job3
{
	/**
	 * String str =" ABcDefG55HIJKL MnOPqRSTU VW22xyz"; 要求： 
	 * 1）先输出字符串的长度，将所有空格去掉后输出新的长度 2）取出数组中的数字，然后求和，输出结果
		输出格式参照： 字符长度为：~ 新字符串长度为：~~ 取出的数为（2个）：~ 结算结果为：~

	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月30日 上午9:46:07
	 * @param args
	 * TODO
	 */
	public static void main(String[] args)
	{
		String str =" ABcDefG55HIJKL MnOPqRSTU VW22xyz";
		System.out.println("未改动长度"+str.length());
		str=str.replaceAll(" ", "");
		System.out.println("去掉空格长度"+str.length());
		char[] charArray = str.toCharArray();
		int count=0,sum=0;
		for (int i = 0; i < charArray.length; i++)
		{
			if(charArray[i]=='0'||charArray[i]=='1'||charArray[i]=='2'||charArray[i]=='3'||charArray[i]=='4'||charArray[i]=='5'||charArray[i]=='6'||charArray[i]=='7'||charArray[i]=='8'||charArray[i]=='9')
			{
				if(charArray[i+1]=='0'||charArray[i+1]=='1'||charArray[i+1]=='2'||charArray[i+1]=='3'||charArray[i+1]=='4'||charArray[i+1]=='5'||charArray[i+1]=='6'||charArray[i+1]=='7'||charArray[i+1]=='8'||charArray[i+1]=='9')
				{
					count++;
					String tmp=charArray[i]+""+charArray[i+1]+"";
					sum+=Integer.valueOf(tmp);
				}
				
			}
		}
		System.out.println("个数"+count+"和"+sum);
	}
}
