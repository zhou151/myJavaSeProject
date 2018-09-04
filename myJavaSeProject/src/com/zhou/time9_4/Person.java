package com.zhou.time9_4;

public class Person implements Runnable
{
	private int time;
	private int num;
	public Person (int time,int num)
	{
		this.time=time;
		this.num=num;
	}
	
	public static void main(String[] args)
	{
		Person tang = new Person(30,900);
		Person liu = new Person(10,1000);
		Person hong = new Person(20,800);
		Thread thread = new Thread(tang,"①----汤少-");
		Thread thread01 = new Thread(liu,"②----柳少-");
		Thread thread02 = new Thread(hong,"③----小洪-");
		thread.start();
		thread01.start();
		thread02.start();
		System.out.println("---开始了爬山---");
	}
	@Override
	public void run()
	{
		for (int i = 1; i <= this.num; i++)
		{
			try
			{
				Thread.sleep(this.time);
				if(i==this.num)
				{
					System.err.println(Thread.currentThread().getName()+"跑了"+i+" 到达终点");
				}
				else if(i%100==0)
				{
					System.out.println(Thread.currentThread().getName()+"正在爬山"+"爬了 "+i+" 米");
				}
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
