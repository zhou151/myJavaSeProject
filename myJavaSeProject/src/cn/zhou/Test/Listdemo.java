package cn.zhou.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Mr_zhou 2018年8月28日 上午11:17:01 TODO HashSet排序+
 */
public class Listdemo
{
	public static void main(String[] args)
	{
		// myTest03();
		myTest04();
	}

	/**
	 * 
	 * @fun-name myTest01
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月28日 下午6:00:06 TODO 集合中对象排序
	 */
	private static void myTest04()
	{
		List<Car> list = null;
		// 线程安全的list
		list = Collections.synchronizedList(new ArrayList<Car>());
		list.add(new Car("名字", "颜色1", 5));
		list.add(new Car("名字", "颜色2", 6));
		list.add(new Car("名字", "颜色3", 9));
		list.add(new Car("名字", "颜色4", 2));
		list.add(new Car("名字", "颜色5", 3));
		for (Car car : list)
		{
			System.out.println(car);
		}
		Collections.sort(list, new Comparator<Car>()
		{
			public int compare(Car arg0, Car arg1)
			{
				int hits0 = arg0.getPrice();
				int hits1 = arg1.getPrice();
				// 这里的hits1 < hits0 改成 hits1 > hits0 就是倒序
				if (hits1 < hits0)
				{
					return 1;
				} else if (hits1 == hits0)
				{
					return 0;
				} else
				{
					return -1;
				}
			}
		});
		System.out.println("-----------------------排序后---------------------------");
		for (Car car : list)
		{
			System.out.println(car);
		}
	}

	/**
	 * 
	 * @fun-name myTest01
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月28日 下午6:00:06 TODO 集合中对象排序
	 */
	public static void myTest01()
	{
		List<Car> list = null;

		// 线程安全的list
		list = Collections.synchronizedList(new ArrayList<Car>());

		list.add(new Car("名字", "颜色", 5));
		list.add(new Car("名字", "颜色2", 6));
		list.add(new Car("名字", "颜色3", 9));
		list.add(new Car("名字", "颜色4", 2));
		list.add(new Car("名字", "颜色5", 3));

		Map<String, Car> map = new HashMap<>();
		for (Car c : list)
			map.put(c.getPrice() + "", c);
		Object[] array = map.keySet().toArray();
		Integer[] arr01 = new Integer[array.length];
		for (int i = 0; i < array.length; i++)
			arr01[i] = Integer.valueOf(array[i].toString());
		Arrays.sort(arr01);
		for (int i : arr01)
			System.out.println("--" + map.get(i + "").getColor() + "--"
					+ map.get(i + "").getName() + "--"
					+ map.get(i + "").getPrice());
	}

	/**
	 * 
	 * @fun-name myTest03
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月29日 上午10:08:21 TODO entrySet 方式遍历map
	 */
	public static void myTest03()
	{
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("12", "你好5");
		map.put("22", "你好2");
		map.put("32", "你好3");
		map.put("42", "你好4");

		for (Map.Entry<String, Object> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + entry.getValue());
		}
	}

	/**
	 * 
	 * @fun-name myTest02
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月28日 上午11:59:41 TODO 集合中手动算法排序
	 */
	public static void myTest02()
	{
		Set<Integer> setList = new HashSet<>();
		setList.add(51325889);
		setList.add(25549);
		setList.add(45);

		Object[] intArr = setList.toArray();
		Integer[] intArr2 = new Integer[intArr.length];
		for (int i = 0; i < intArr.length; i++)
		{
			intArr2[i] = (Integer) (intArr[i]);
		}

		Arrays.sort(intArr2);

		System.out.println("--------排序 ----------");
		for (int i = 0; i < intArr2.length; i++)
		{
			System.out.println(intArr2[i]);
		}

		Integer[] intArr3 = new Integer[intArr2.length];
		for (int i = intArr2.length - 1; i >= 0; i--)
		{
			intArr3[intArr2.length - i - 1] = intArr2[i];
		}
		System.out.println("---------翻转---------");
		for (Integer i : intArr3)
		{
			System.out.println(i);
		}
	}
}
