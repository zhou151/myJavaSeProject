package com.zhou.lianxi01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * 
 * @author Mr_zhou 
 * 2018年9月3日 下午10:11:03 </br>
 * TODO 时期类Calendar和SimpleDateFormat日期格式化
 */
public class MyDateTest
{
	public static void main(String[] args)
	{
		/**
		 * Calendar 时间类(单例模式)
		 */
		Calendar c=Calendar.getInstance();
		//c.set(2017,9,2,20,2,2); 不设置为当前时间
		System.out.println("年 "+c.get(c.YEAR));
		System.out.println("月 "+(c.get(c.MONTH)+1));
		System.out.println("日 "+c.get(c.DATE));
		System.out.println("12小时制 "+c.get(c.HOUR));
		System.out.println("24小时制 "+c.get(c.HOUR_OF_DAY));
		System.out.println("分 "+c.get(c.MINUTE));
		System.out.println("秒 "+c.get(c.SECOND));
		System.out.println("星期 "+(c.get(c.DAY_OF_WEEK)-1));
		System.out.println("--------------手动格式化-----------------");
		String strTmp=c.get(c.YEAR)+"年"+(c.get(c.MONTH)+1)+"月"+c.get(c.DATE)+"日"
		+c.get(c.HOUR_OF_DAY)+"点:"+c.get(c.MINUTE)+":分"+c.get(c.SECOND)+"秒";
		System.out.println(strTmp);
		System.out.println("--------------SimpleDateFormat格式化-----------------");
		
		/** 日期格式化转换符,一定注意大小写
		 *  yyyy 年
		 *  MM 月 
		 *  dd 日
		 *  hh (时)12小时制
		 *  HH (时)24小时制
		 *  mm 分
		 *  ss 秒
		 *  S 毫秒
		 *  E 星期几
		 *  D 一年中的第几天
		 *  F 一个月的第几个星期(会把这个月总共过的天数除以7)
		 *  w 一年中的第几个星期
		 *  W 一年中的第几个星期(会根据实际情况来算)
		 *  a 上午下午标识
		 *  k (时)12小时制
		 *  K (时)24小时制
		 *  z 表示时区
		 */
		//2018年09月03日 22点:10分:17秒星期一下午
		SimpleDateFormat simDateF=new SimpleDateFormat("yyyy年MM月dd日 HH点:mm分:ss秒Ea");
		//String format = simDateF.format(new Date());
		String format = simDateF.format(c.getTime());
		System.out.println(format);
	}
}
