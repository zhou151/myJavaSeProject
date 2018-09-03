package com.zhou.lianxi01;

import java.util.Arrays;

/**
 * 
 * @author Mr_zhou
 * 2018年9月3日 下午6:53:17 <br/>
 * TODO String 常用总结
 */
public class StringTest
{
	public static void main(String[] args)
	{
		String str="123456789";
		//substring()单个参数,从参数下标,截取到字符串末尾
		System.out.println(str.substring(str.length()-3)); //789
		
		//substring()两个参数,从参数1(包括),截取到参数2(不包括),都是下标。
		System.out.println(str.substring(3,6)); //456
		
		//contains()返回是否包含参数字符串,返回布尔
		System.out.println(str.contains("2")); // true
		
		//charAt() 返回指定下标的cahr值,
		System.out.println(str.charAt(0)); //1
		
		//indexOf()返回参数字符串的下标,没有则返回-1
		System.out.println(str.indexOf("12")); //0
		
		//startsWith() 返回是否以参数字符串开头,返回布尔
		System.out.println(str.startsWith("123")); //true
		
		//endsWith() 返回是否以参数字符串结尾,返回布尔
		System.out.println(str.endsWith("789")); //true
		
		//format() 字符串格式化
		/**
		 * %s 字符串类型     %c 字符类型 
		 * %b 布尔            %d 整数类型(十进制)
		 * %x 整数类型(十六进制)    %o 整数类型(八进制)
		 * %f浮点类型     %a十六进制浮点类型
		 * %e指数类型   %g通用指数类型
		 * %h散列码   %%百分比类型
		 * %n 换行符
		 * %tx 时间与时间类型x代表不同的时间转换符
		 */
		String strTmp=String.format("%b", 3>2);
		System.out.println(strTmp);  //true
		
		//getBytes()返回字符串的字节数组
		System.out.println(Arrays.toString(str.getBytes())); //[49, 50, 51, 52, 53, 54, 55, 56, 57]
		
		//toCharArray() 返回字符串的char数组
		System.out.println(Arrays.toString(str.toCharArray())); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		//replaceAll基于正则表达式的匹配值全部替换
		System.out.println(str.replaceAll("1", "2")); //223456789
		
		//replaceA基于字符串的匹配值全部替换
		System.out.println(str.replace("2", "3")); //133456789
		
		//replaceFirst()基于参数1字符串的匹配第一次出现的然后替换为参数2
		System.out.println(str.replaceFirst("", ""));
		
		//trim()去掉字符串两边的空格
		System.out.println(str.trim());
		
		//split()根据正则表达式拆分字符串,返回字符串数组
		System.out.println(Arrays.toString(str.split("")));
		
		//length返回字符串的长度
		System.out.println(str.length());
		
		//toLowerCase()将字符串中字母大写换成小写
		System.out.println("返回小写的"+str.toLowerCase());
		
		//toUpperCase()将字符串中字母小写换成大写
		System.out.println("返回大写的"+str.toUpperCase());
		
		//----------------StringBuffer------------------------------------
		StringBuffer strbu=new StringBuffer(str);
		
		//append()在尾部追加一个字符串
		System.out.println(strbu.append("ABC")); //123456789ABC
		
		//insert()在参数1下标处添加参数2字符串
		System.out.println(strbu.insert(0, "QWE")); //QWE123456789ABC
		
		//deleteCharAt()删除指定下标的char值
		System.out.println(strbu.deleteCharAt(0)); //WE123456789ABC
		
		//delete(int s,int e)删除下标为参数1到参数2(不包括)后的值
		System.out.println(strbu.delete(0, 2));  //123456789ABC
		
		//reverse()翻转字符串
		System.out.println(strbu.reverse()); //CBA987654321
	}
}
