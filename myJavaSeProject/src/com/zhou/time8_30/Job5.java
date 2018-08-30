package com.zhou.time8_30;

import java.util.Scanner;

public class Job5
{
	/**
	 * 要求： 1）使用用户输入(scanner)的方式 2）方法名分别为（加减乘除）
	 *  ：add、subtract、multiply、divide 3）参数类型自定义
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月30日 上午10:07:22
	 * @param args
	 * TODO
	 */
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("请选择计算类型+-*/");
		String str=in.next();
		if(str.equals("+"))
		{
			add();
		}else if(str.equals("-"))
		{
			subtract();
		}else if(str.equals("*"))
		{
			multiply();
		}else if(str.equals("/"))
		{
			divide();
		}
	}
	private static void divide()
	{
		System.out.println("输入第一个数");
		int args1=in.nextInt();
		System.out.println("输入第二个数");
		int args2=in.nextInt();
		System.out.println("计算结果为"+(args1/args2));
	}
	private static void multiply()
	{
		System.out.println("输入第一个数");
		int args1=in.nextInt();
		System.out.println("输入第二个数");
		int args2=in.nextInt();
		System.out.println("计算结果为"+(args1*args2));
	}
	private static void subtract()
	{
		System.out.println("输入第一个数");
		int args1=in.nextInt();
		System.out.println("输入第二个数");
		int args2=in.nextInt();
		System.out.println("计算结果为"+(args1-args2));
	}
	private static void add()
	{
		System.out.println("输入第一个数");
		int args1=in.nextInt();
		System.out.println("输入第二个数");
		int args2=in.nextInt();
		System.out.println("计算结果为"+(args1+args2));
	}
}
