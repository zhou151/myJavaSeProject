package com.zhou.lianxi01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
		
		/** SimpleDateFormat日期格式化转换符,一定注意大小写
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
		System.out.println("--------------------String.format日期,时间格式化转换符--------------------------------");
		/**
		 * 1$ 对第一个参数进行引用
		 * String.format日期格式化 转  换  符  ,注意大小写
		 * %tc  全部日期和时间信息__星期二 九月 04 09:08:13 CST 2018
		 * %tF  年-月-日 格式__2018-09-04
		 * %tD  月/日/年 格式__09/04/18
		 * %tr HH:MM:SS PM 格式（12时制）__09:11:56 上午
		 * %tT HH:MM:SS 格式（24时制）__09:11:56
		 * %tR HH:MM 格式（24时制）__09:11
		 */
		Date e = new Date();
		
		//多个占位符引用指定参数,引用第一个%1$tT ，引用第二个%2$tT
		System.out.println(String.format("%tF %1$tT", e));
		
		System.out.println(String.format("%tc", e));
		System.out.println(String.format("%tF", e));
		System.out.println(String.format("%tD", e));
		System.out.println(String.format("%tr", e));
		System.out.println(String.format("%tT", e));
		System.out.println(String.format("%tR", e));
		System.out.println("----------------------------------------");
		/**
		 * String.format时间格式  转换符
		 * %tH  2位数字24时制的小时（不足2位前面补0）__09
		 * %tI  2位数字12时制的小时（不足2位前面补0）__09
		 * %tl  2位数字12时制的小时（不足2位前面不会补0）__9
		 * %tk  2位数字24时制的小时（前面不补0）__ 9
		 * %tM  2位数字的分钟（不足2位前面补0） __25
		 * %tS  2位数字的秒（不足2位前面补0） __01
		 * %tL  3位数字的毫秒（不足3位前面补0）__620
		 * %tN  9位数字的毫秒数（不足9位前面补0）__620000000
		 * %tp  上午或下午标记__上午
		 * %tz  相对于GMT的RFC822时区的偏移量 __+0800
		 * %tZ  时区缩写字符串   __CST
		 */
		System.out.println(String.format("%tH", e));
		System.out.println(String.format("%tI", e));
		System.out.println(String.format("%tl", e));
		System.out.println(String.format("%tk", e));
		System.out.println(String.format("%tM", e));
		System.out.println(String.format("%tS", e));
		System.out.println(String.format("%tL", e));
		System.out.println(String.format("%tN", e));
		System.out.println(String.format("%tp", e));
		System.out.println(String.format("%tz", e));
		System.out.println(String.format("%tZ", e));
	}
}
