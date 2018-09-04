package com.zhou.time9_4;

public class Person implements Runnable
{
	private int time;
	private int num;
	public Person (int time)
	{
		this.time=time;
		this.num=0;
	}
	
	public static void main(String[] args)
	{
		//小汤500毫秒1米
		Person tang = new Person(500);
		//小柳200毫秒1米
		Person liu = new Person(200);
		Thread thread = new Thread(tang,"-----汤骚-");
		Thread thread01 = new Thread(liu,"柳少------");
		thread.start();
		thread01.start();
		
	}
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			try
			{
				Thread.sleep(this.time);
				this.num+=1;
				System.out.println(Thread.currentThread().getName()+"正在爬山"+"爬了 "+this.num+" 米");
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
