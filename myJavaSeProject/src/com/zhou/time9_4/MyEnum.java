package com.zhou.time9_4;

public enum MyEnum
{
	RED("红色"),
	BLUE("蓝色");
	private String code;
	private MyEnum(String code)
	{
		this.code=code;
	}
	public String getCode()
	{
		return code;
	}
}
