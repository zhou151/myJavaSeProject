package com.zhou.lianxi01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListTest
{
	public static void main(String[] args)
	{
		listTest01();
	}

	public static void listTest01()
	{
		/**
			5、已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数
			2008 北京奥运会男足参赛国家： 
			科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
		 */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("科特迪瓦");
		arrayList.add("阿根廷");
		arrayList.add("澳大利亚");
		arrayList.add("塞尔维亚");
		arrayList.add("荷兰");
		arrayList.add("尼日利亚");
		arrayList.add("日本");
		arrayList.add("美国");
		arrayList.add("中国");
		arrayList.add("新西兰");
		arrayList.add("巴西");
		arrayList.add("比利时");
		arrayList.add("韩国");
		arrayList.add("喀麦隆");
		arrayList.add("洪都拉斯");
		arrayList.add("意大利");
		
		Collections.shuffle(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++)
		{
			if(i<=3)
			{
				System.out.println("第一组:-->"+arrayList.get(i));
			}else if(i>=4&&i<=7)
			{
				System.out.println("----------------第二组:-->"+arrayList.get(i));
			}else if(i>=8&&i<=11)
			{
				System.out.println("第三组:-->"+arrayList.get(i));
			}else if(i>=12&&i<=15)
			{
				System.out.println("----------------第四组:-->"+arrayList.get(i));
			}
		}
		
	}
}
