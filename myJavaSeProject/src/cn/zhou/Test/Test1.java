package cn.zhou.Test;

public class Test1
{
	
	static final Object  o=new Test1();
	public static void main(String[] args)
	{
		 
		/*
		 * 基本数据类型
			byte short int long  整形
			float double 	浮点
			boolean 	逻辑
			char	字符
			
		*/
		
		
		String str="str";
		Test05 test05 = new  Test1().new Test05();
		
		
	}
	public void  test(UsbTest u)
	{
		u.open();
		System.out.println("ok");
	}
	
	class Test05{
		void print(){
			System.out.println("内部类打印");
		}
	}
}
