package cn.zhou.Test;

public class Test1
{
	
	static final Object  o=new Test1();
	public static void main(String[] args)
	{
		 
		((Test1)o).test(new UsbTestImp());
	}
	public void  test(UsbTest u)
	{
		u.open();
		System.out.println("ok");
	}
}
