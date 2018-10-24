package com.zhou.mianshi;

public class Test2
{
	public static void main(String[] args)
	{
		StringBuffer stringBuffer = new StringBuffer("123456");
		stringBuffer.delete(2, 3);
		System.out.println(stringBuffer);
	}
}
