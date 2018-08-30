package com.zhou.time8_30;

import java.util.ArrayList;
import java.util.List;

import com.zhou.time8_30.entity.Student;

public class Job7
{
	/**
	 * 在这个list 的基础上，完成下列要求： (1) 计算所有学生的平均年龄 (2) 计算各个班级的平均分
	 * @fun-name main
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月30日 上午10:27:40
	 * @param args
	 * TODO
	 */
	public static void main(String[] args)
	{
		List <Student> list= new ArrayList(); 
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
