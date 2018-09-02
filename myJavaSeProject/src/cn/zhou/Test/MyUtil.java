package cn.zhou.Test;

import java.util.Random;

public class MyUtil
{
	public static void main(String[] args)
	{
		String  [] arr=new String [] {"周","杨","付"};
		int random = getRandom(0,arr.length-1);
		System.out.println("拿外卖的人--> "+arr[random]);
	}
	
	/**
	 * 	
	 * @fun-name getRandom
	 * @return-type int
	 * @author Mr_zhou
	 * @date 2018年8月14日 下午12:04:35
	 * @param min 最小值 固定值
	 * @param max 最大值 固定值
	 * @return 返回最小值--到最大值之间的随机数
	 * TODO
	 */
	public static int getRandom(int min,int max)
	{
		return  new Random().nextInt(max-min+1)+min;
	}
}
