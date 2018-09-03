package com.zhou.lianxi01;

/**
 * 
 * @author Mr_zhou
 * 2018年9月3日 下午6:42:38  <br/>
 * TODO java多线程
 */
//------------------------方式一实现Runnable接口--------------------------
public class TestThread  implements Runnable
{
	public static void main(String[] args)
	{
		ThreadPring();
	}
	static void ThreadPring()
	{
		//-------------------------方式二,new一个Runnable()匿名内部类--------------------------------------
		Runnable run2=new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		//------------------------方式三,lambda简写,jdk1.8特性---------------------------------------
		Runnable run=()->
		{
			System.out.println(Thread.currentThread().getName());
		};
		new Thread(run).start();
		new Thread(run2).start();
		new Thread(new TestThread()).start();
		new myThread().start();
	}
	
	@Override
	public void run()
	{
		try
		{
			//线程休眠3秒
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
//------------------------方式四,集成线程类Thread---------------------------------------
class myThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
