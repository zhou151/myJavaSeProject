package com.zhou.lianxi01;

import java.io.Serializable;

public class Student implements Serializable
{
	private String name;  

    private int age;  

    private int score;  

    private String classNum;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
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

	public Student(String name, int age, int score, String classNum)
	{
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	} 
    
    public Student()
	{
		// TODO Auto-generated constructor stub
	}
}
