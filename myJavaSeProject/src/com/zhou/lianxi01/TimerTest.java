package com.zhou.lianxi01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * @author Mr_zhou
 * 2018年9月3日 下午6:40:51 <br/>
 * TODO java计时器使用
 */
public class TimerTest
{
	public static void main(String[] args)
	{
		Timer t=new Timer();
		myTimer mytimer=new myTimer();
		//计时器一秒后启动,2秒执行一次run()方法
		t.schedule(mytimer, 1000,2000);
		/*匿名内部类方式new myTimer();
		TimerTask mytimer2=new TimerTask()
		{
			@Override
			public void run()
			{
				SimpleDateFormat sdm=new SimpleDateFormat("yyyy年MM月dd日 HH点:mm分:ss:秒");
				String format = sdm.format(new Date());
				System.out.println("当前时间"+format);
			}
		};*/
	}
}
class myTimer extends TimerTask
{
	@Override
	public void run()
	{
		SimpleDateFormat sdm=new SimpleDateFormat("yyyy年MM月dd日 HH点:mm分:ss:秒");
		String format = sdm.format(new Date());
		System.out.println("当前时间"+format);
	}
}