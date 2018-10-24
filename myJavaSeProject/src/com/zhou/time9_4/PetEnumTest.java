package com.zhou.time9_4;

public class PetEnumTest
{
	public static void main(String[] args)
	{
		PetEnum[] values = PetEnum.values();
		for (PetEnum petEnum : values)
		{
			System.out.println(petEnum.getName());
			System.out.println(petEnum.getAge());
			System.out.println("---------------");
		}
		System.out.println("======================");
		
		System.out.println(MyEnum.RED.getCode());
		System.out.println(MyEnum.BLUE.getCode());
		
		System.out.println("======================");
		
		MyEnum[] values2 = MyEnum.values();
		for (MyEnum myEnum : values2)
		{
			System.out.println(myEnum.getCode()+" -------");
		}
	}
}
