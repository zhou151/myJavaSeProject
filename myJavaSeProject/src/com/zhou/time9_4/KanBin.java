package com.zhou.time9_4;

public class KanBin implements Runnable
{
	/**
	 * 4、模拟叫号看病
		1)	需求说明
		a.	某科室一天需看普通号50个，特需号10个
		b.	特需号看病时间是普通号的2倍
		c.	开始时普通号和特需号并行叫号，叫到特需号的概率比普通号高
		d.	当普通号叫完第10号时，要求先看完全部特需号，再看普通号
		e.	使用多线程模拟这一过程
	 */
	
	private int num;
	private int time;
	public KanBin(int num, int time)
	{
		super();
		this.num = num;
		this.time = time;
	}
	public static void main(String[] args)
	{
		KanBin kanBin = new KanBin(50,500);
		KanBin kanBin01 = new KanBin(10,1000);
		Thread thread = new Thread(kanBin,"普通号");
		Thread thread01 = new Thread(kanBin01,"---特殊号");
		thread.start();
		thread01.start();
	}
	@Override
	public void run()
	{
		for(int i=1;i<=this.num;i++)
		{
			String name = Thread.currentThread().getName();
			if(name.equals("普通号")) {
				try
				{
					Thread.sleep(1);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}else {
				try
				{
					Thread.sleep(2);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(name +i+" 号病人正在看病");
			if(name.equals("普通号")&&i==10)
			{
				try
				{
					Thread.sleep(300);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
