package com.zhou.lianxi01;

import java.util.ArrayList;
import java.util.List;

public class StudentTest
{
	public static void main(String[] args)
	{
		List <Student> list = new ArrayList<Student>();
		list.add(new Student("Tom", 18, 100, "class05"));  

		list.add(new Student("Jerry", 22, 70, "class04")); 

		list.add(new Student("Owen", 25, 90, "class05")); 

		list.add(new Student("Jim", 30,80 , "class05")); 

		list.add(new Student("Steve", 28, 66, "class06"));

		list.add(new Student("Kevin", 24, 100, "class04"));
			
		int avgAge=0 , avgScore=0;
		for(Student s:list)
		{
			avgAge+=s.getAge(); avgScore+=s.getScore();
		}
		avgAge=avgAge/list.size(); avgScore=avgScore/list.size();
		System.out.println("年龄平均数: "+avgAge+"------"+"分数平均数: "+avgScore);
	}
}
