package com.zhou.lianxi01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest
{	
	public static void main(String[] args)
	{
		testFile();
	}
	
	
	/**
	 * @fun-name testFile02
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月29日 下午1:23:31
	 * TODO 递归遍历出控制台输入的目录下的所有子目录+文件
	 */
	static int indexFile=0;
	static int indexDirectory=0;
	public static void testFile()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入你要遍历的目录");
		String strPath=in.next();
		File file = new File(strPath);
		if(!file.exists())
		{System.out.println("目录不存在");return;}
		File[] listFiles = file.listFiles();	
		each(listFiles);
		System.out.println("文件夹总共--> "+indexDirectory+" 个");
		System.out.println("文件总共--> "+indexFile+" 个");
	}
	/*递归方法*/
	private static void each(File[] fileList)
	{
		if(fileList==null) {return;}
		for (File file : fileList)
		{
			if(file.isFile()) {
				System.out.println("文件---> "+file);indexFile++;
			}
			else if(file.isDirectory()) {
				System.out.println("---*-文件夹===> "+file);
				each(file.listFiles());indexDirectory++;
			}
		}
	}

}
