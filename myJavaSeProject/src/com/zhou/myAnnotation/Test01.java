package com.zhou.myAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
	public static void main(String[] args) {
		try {
			//反射加载类
			System.out.println("----------反射加载类-----------");
			Class <SxStudent> clazz = (Class<SxStudent>) Class.forName("com.zhou.myAnnotation.SxStudent");
			
			//注解_得到类上的注解
			System.out.println("----------注解_得到类上的注解-----------");
			SxtTable  annotation = (SxtTable) clazz.getAnnotation(SxtTable.class); 
			System.out.println(annotation.value()); //u_table
			
			//注解_得到属性上的注解
			System.out.println("----------注解_得到属性上的注解-----------");
			Field declaredField = clazz.getDeclaredField("name");  
			Field[] declaredFields2 = clazz.getDeclaredFields();
			for (Field field : declaredFields2) {
				Field declaredField01 = clazz.getDeclaredField(field.getName());
				SxtField annotation2 = declaredField01.getAnnotation(SxtField.class);
				System.out.println("遍历"+annotation2.column()+"---"+annotation2.length()+"---"+annotation2.column());
			}
			SxtField annotation2 = declaredField.getAnnotation(SxtField.class);
			System.out.println(annotation2.column()+"---"+annotation2.length()+"---"+annotation2.column());
			
			//反射_得到类的属性
			System.out.println("----------反射_得到类的属性-----------");
			Field[] declaredFields = clazz.getDeclaredFields(); //得到全部
			Field f = clazz.getDeclaredField("id"); 			//得到单个
			for (Field field : declaredFields) {
				System.out.println(field+"______"+field.getName());
			}
			System.out.println(f);
			
			//反射_得到类的方法
			System.out.println("----------反射_得到类的方法-----------");
			Method[] declaredMethods = clazz.getDeclaredMethods();  //得到全部
			Method declaredMethod = clazz.getDeclaredMethod("print",null);  //得到单个
			Method declaredMethod01 = clazz.getDeclaredMethod("print01",String.class);  //得到单个
			for (Method method : declaredMethods) {
				System.out.println(method+"______"+method.getName());
			}
			System.out.println(declaredMethod);
			System.out.println(declaredMethod01);
			
			//反射_得到构造器
			System.out.println("----------反射_得到构造器-----------");
			Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
			for (Constructor constructor : declaredConstructors) {
				System.out.println(constructor+"______"+constructor.getName());
			}
			Constructor declaredConstructor1 = clazz.getDeclaredConstructor(null);
			Constructor declaredConstructor = clazz.getDeclaredConstructor(Integer.class,String.class,Integer.class);
			System.out.println(declaredConstructor+"___"+declaredConstructor.getName());
			System.out.println(declaredConstructor1+"___"+declaredConstructor1.getName());
			
			//反射_创建对象
			System.out.println("----------反射_创建对象-----------");
			SxStudent obj = clazz.newInstance();     
			Constructor<SxStudent> declaredConstructor2 = clazz.getDeclaredConstructor(Integer.class,String.class,Integer.class);
			SxStudent obj01 = declaredConstructor2.newInstance(1,"小明",30);
			System.out.println(obj01);
			
			//反射_调用普通方法
			System.out.println("----------反射_调用普通方法-----------");
			SxStudent obj03 = clazz.newInstance();   
			Method m2 = clazz.getDeclaredMethod("print", null);
			m2.setAccessible(true);
			m2.invoke(obj03);
			 
			//反射_操作属性
			System.out.println("----------反射_操作属性-----------");
			SxStudent obj04 = clazz.newInstance();   
			Field declaredField2 = clazz.getDeclaredField("id");
			declaredField2.setAccessible(true);
			declaredField2.set(obj04, 1);
			System.out.println(obj04.getId());
			System.out.println(declaredField2.get(obj04));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
