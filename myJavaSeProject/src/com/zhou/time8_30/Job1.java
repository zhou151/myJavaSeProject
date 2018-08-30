package com.zhou.time8_30;

public class Job1
{
	/**
	 * 
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月30日 上午9:08:26
	 * @param args
	 * TODO  递归打印99乘法表
	 */
	public static void main(String[] args)
	{
		print(9);
	}

	private static void print(int args)
	{
		if(args<=0)
		{
			return;
		}else {
			print(args-1);
		}
		
		for (int i = 1; i <=args; i++)
		{
			System.out.print(i+"*"+args+"="+(i)*args+" ");
		}
		System.out.println();
	}
	
}
