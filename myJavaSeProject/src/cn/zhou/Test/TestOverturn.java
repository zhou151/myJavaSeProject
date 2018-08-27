package cn.zhou.Test;


/**
 * 翻转数组
 * @author Mr_zhou
 * 2018年8月27日 下午10:58:57
 * TODO
 */
public class TestOverturn
{
	
	/**
	 * 
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月13日 上午12:06:56
	 * @param args
	 * TODO
	 */
	public static void main(String[] args)
	{
		int arrInt[]=new int [] {1,2,3,4,5,6};
		overturn(arrInt);
	}
	/**
	 * 
	 * @fun-name overturn
	 * @return-type int[]
	 * @author Mr_zhou
	 * @date 2018年8月13日 上午12:04:14
	 * @param arrInt
	 * @return 翻转数组
	 * 
	 */
	public static int[] overturn(int arrInt[])
	{
		int arrTmp[]=new int [arrInt.length];
		for(int i=arrInt.length-1;i>=0;i--)
		{
			arrTmp[arrInt.length-1-i]=arrInt[i];
		}
		return arrTmp;
	}
}
