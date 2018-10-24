package com.zhou.myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Mr_zhou
 * 2018年10月11日 上午11:29:31
 * TODO 正则表达式
 */
public class myRegex {
	public static void main(String[] args) {
		String str="str123str";
		str=str.replaceAll("[^1-9]", "").replaceAll(" ", "");
		Integer num = Integer.valueOf(str);
		if(num instanceof Integer)
		{
			print("ok");
		}
		
		/*java中的正则表达式 -- 基本*/
		Pattern patt=Pattern.compile("[^1-9]");
		Matcher matcher = patt.matcher(str);
		boolean matches2 = matcher.matches();
		print(matches2);
		
		/*字符串匹配正则表达式--简写*/
		boolean matches = str.matches("[^1-9]");
		print(matches);
		
		/** 	正则表达式常用
		 * 		^ 匹配字串的开始
		 * 		\ 转义字符
		 * 		$ 匹配字串的结尾
		 * 		* 0-多次匹配
		 * 		+ 1-多次匹配
		 * 		? 0-1次匹配
		 * 		{1} 1次匹配
		 * 		{2,} 2-多次匹配
		 * 		{3,6} 3-6次匹配
		 * 		[0-9] 匹配数字 = \d
		 * 		[^0-9] 匹配数字 = \D
		 * 		[a-zA-Z] 等于 [a-z]|[A-Z] 匹配字母
		 * 		abc|ABC 匹配abc或者ABC
		 * 		\. 匹配任何一个字符
		 * 		\s 匹配任何空白字符，包括空格、制表符、换页符等等。等价于 [ \f\n\r\t\v]。
		 *		\S 匹配任何非空白字符。等价于 [^ \f\n\r\t\v]
		 *		\w 匹配字母.数字.下划线[A-Za-z0-9_]
		 *		\W 匹配非字母、数字、下划线。等价于 [^A-Za-z0-9_]
		 */
		
		
	}
	
	static void print(Object o) {
		System.out.println(o);
	}
}
