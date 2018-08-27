package cn.zhou.Test;

/**
 * 
 * @author Mr_zhou
 * 2018年8月8日 上午9:13:42
 * TODO
 */
public class Test2
{

	/**
	 * 
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月8日 上午9:13:47
	 * @param args
	 * TODO
	 */
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; i <= j; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			for (int j = 1; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		int []arr1= {1,2};
	}

}
