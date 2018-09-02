package com.zhou.time8_30;

import java.util.Arrays;

public class Job2
{
	/**
	 * 2）将如下字符串拆分成一个数组（10） String str = “11,32,+45,,234,324,23,,243,”; 要求：
	 * 1）输出数组长度，要求其长度为7 2）使用选择排序将数组按降序排序 3）输出数组中第三大的值 4）求数组的平均数 输出格式参照： 数组长度为：~
	 * 数组降序为：~~ 数组第三大指为：~ 平均数为：~
	 * 
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月30日 上午9:28:52
	 * @param args
	 *            TODO
	 */
	public static void main(String[] args)
	{
		String str = "11,32,+45,,234,324,23,,243,";
		String[] arrStr = str.replaceAll(",,", ",").split(",");
		System.out.println("数组长度" + arrStr.length);
		int []intArr= new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++)
			intArr[i]=Integer.valueOf(arrStr[i]);
		
		
		
		/*
		 * //冒泡排序
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]){
					int num = arr[i]; 
					arr[i] = arr[i+1];
					arr[i+1] = num;
				}
			}
		}
		 * */
		
		System.out.println("选择排序,升序");
		for (int i = 0; i < intArr.length; i++)
		{
			for (int j = i + 1; j < intArr.length; j++)
			{
				if (intArr[i] > intArr[j])
				{
					int num = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = num;
				}
			}
		}
		int avgArr=0;
		System.out.println("数组的第三大值"+intArr[2]);
		System.out.println(Arrays.toString(intArr));
		System.out.println("数组翻转,降序");
		int [] intArr2= new int[intArr.length];
		for (int i = intArr.length-1; i >=0; i--)
		{
			intArr2[intArr.length-1-i]=intArr[i];
			avgArr+=intArr[i];
		}
		avgArr/=intArr.length;
		System.out.println(Arrays.toString(intArr2));
		System.out.println("数组平均值为"+avgArr);
		
	}
}
