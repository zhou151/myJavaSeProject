package com.zhou.test.t8_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.zhou.Test.Car;

/**
 * 
 * @author Mr_zhou
 * 2018年8月28日 上午11:17:01
 * TODO HashSet排序+
 */
public class Listdemo
{
	public static void main(String[] args)
	{
		
		myTest01();
	}
	
	
	/**
	 * 
	 * @fun-name myTest01
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月28日 下午6:00:06
	 * TODO 集合中对象排序
	 */
	public  static void myTest01()
	{
		List<Car> list=new ArrayList <Car> ();
		list.add(new Car("名字","颜色",5));
		list.add(new Car("名字","颜色2",6));
		list.add(new Car("名字","颜色3",9));
		list.add(new Car("名字","颜色4",2));
		list.add(new Car("名字","颜色5",3));
		Map<String,Car> map=new HashMap<>();
		for(Car c : list)
			map.put(c.price.toString(),c);
		Object[] array = map.keySet().toArray();
		Integer [] arr01=new Integer [array.length];
		for(int i=0;i<array.length;i++)
			arr01[i]=Integer.valueOf(array[i].toString());
		Arrays.sort(arr01);
		for(int i : arr01)
			System.out.println("--"+map.get(i+"").color+"--"+map.get(i+"").name+"--"+map.get(i+"").price);
	}
	
	
	
	
	
	

	/**
	 * 
	 * @fun-name myTest02
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月28日 上午11:59:41
	 * TODO
	 */
	private static void myTest02()
	{
		Set<Integer> setList=new HashSet<>();
		setList.add(51325889);
		setList.add(25549);
		setList.add(45);
		
		Object[] intArr = setList.toArray();
		Integer [] intArr2=new Integer[intArr.length];
		for (int i = 0; i < intArr.length; i++)
		{
			intArr2[i]=(Integer)(intArr[i]);
		}
		
		Arrays.sort(intArr2);
		
		System.out.println("--------排序 ----------");
		for (int i = 0; i < intArr2.length; i++)
		{
			System.out.println(intArr2[i]);
		}
		
		Integer [] intArr3=new Integer[intArr2.length];
		for(int i=intArr2.length-1;i>=0;i--)
		{
			intArr3[intArr2.length-i-1]=intArr2[i];
		}
		System.out.println("---------翻转---------");
		for(Integer i : intArr3)
		{
			System.out.println(i);
		}	
	}
}
