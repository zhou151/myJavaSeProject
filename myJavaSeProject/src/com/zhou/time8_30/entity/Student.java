package com.zhou.time8_30.entity;

public class Student
{
	private int age;
	private int score;
	private String classNum;
	private String name;
	
	public Student( String name,int age, int score, String classNum)
	{
		super();
		this.age = age;
		this.score = score;
		this.classNum = classNum;
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public String getClassNum()
	{
		return classNum;
	}
	public void setClassNum(String classNum)
	{
		this.classNum = classNum;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
