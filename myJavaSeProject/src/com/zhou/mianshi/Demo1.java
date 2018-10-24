package com.zhou.mianshi;

import java.math.BigInteger;
import java.util.Arrays;

public class Demo1
{
	public static void main(String[] args)
	{
		//test(3);
		//test2("200000000000000000000","200022222000000000000000000000");
		
		
		String charTest = charTest("BACCAAHEFGHFF");
		System.out.println(charTest);
	}



	/**
	 * 
	 * @fun-name charTest
	 * @return-type String
	 * @author Mr_zhou
	 * @date 2018年9月12日 下午8:18:07
	 * @param string
	 * @return 输出最后出现的单次出现的字符,所有字符都两次出现将返回null
	 * TODO
	 */
	private static String charTest(String string)
	{
		char[] charArray = string.toCharArray();
		String result=null;
		for (int i = 0; i <charArray.length; i++)
		{
			StringBuffer stringBuffer = new StringBuffer(string);
			String replaceFirst =stringBuffer.deleteCharAt(i).toString();
			if(replaceFirst.indexOf(charArray[i])==-1)
			{
				result=charArray[i]+"";
			}
			stringBuffer=null;
		}
		return result;
	}



	private static void test2(String string, String string2)
	{
		BigInteger bigInteger = new BigInteger(string);
		BigInteger bigInteger2 = new BigInteger(string2);
		BigInteger multiply = bigInteger.multiply(bigInteger2);
		System.out.println(multiply);
	}



	/**
	 * 
	 * @fun-name test
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月12日 下午7:21:11
	 * @param input 输入数
	 * TODO  
	 */
	private static void test(int input)
	{
		System.out.println("输入数 "+input);
		int intArr []=new int[input];
		for (int i = 0; i < intArr.length; i++)
		{
			intArr[i]=i+1;
		}
		int intTmp1=intArr[0];
		for (int i = 0; i < input; i++)
		{
			
		}
		System.out.println(Arrays.toString(intArr));
	}
}
