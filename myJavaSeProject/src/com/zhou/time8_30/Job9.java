package com.zhou.time8_30;

import java.util.Date;

public class Job9
{
	public static void main(String[] args)
	{
		/**
		 * 1$ 对第一个参数进行引用
		 * 日期格式化 转  换  符  ,注意大小写
		 * %tc  全部日期和时间信息__星期二 九月 04 09:08:13 CST 2018
		 * %tF  年-月-日 格式__2018-09-04
		 * %tD  月/日/年 格式__09/04/18
		 * %tr HH:MM:SS PM 格式（12时制）__09:11:56 上午
		 * %tT HH:MM:SS 格式（24时制）__09:11:56
		 * %tR HH:MM 格式（24时制）__09:11
		 */
		Date e = new Date();
		System.out.println(String.format("%tc", e));
		System.out.println(String.format("%tF", e));
		System.out.println(String.format("%tD", e));
		System.out.println(String.format("%tr", e));
		System.out.println(String.format("%tT", e));
		System.out.println(String.format("%tR", e));
		System.out.println("----------------------------------------");
		/**
		 * 时间格式  转换符
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
