package com.zhou.time9_4;

public enum PetEnum
{
	pig("小猪",1),
	cat("小猫",2);
	String name;
	Integer age;
	
	public String getName()
	{
		return name;
	}
	public Integer getAge()
	{
		return age;
	}
	private PetEnum(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}
}
