package com.zhou.lianxi01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoTest
{
	public static void main(String[] args)
	{
		//fileOut();
		fileInput();
	}

	/**
	 * 
	 * @fun-name fileInput
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月2日 上午11:12:31
	 * TODO 文本输入流 
	 * 接口  Reader
	 * 实现类 FileReader
	 */
	private static void fileInput()
	{
		try
		{
			//-----------------------------------------------------
			File file = new File("D:/a.txt");
			Reader fileReader = new FileReader(file);
			//文本字符长度
			System.out.println("文本字符长度 :"+file.length());
			//创建char数组,大小为文本的字符长度
			char [] charArr=new char[(int)file.length()];
			
			fileReader.read(charArr);
			String string = new String(charArr);
			
			System.out.println(string);
			//-----------------------------------------------------
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @fun-name fileOut
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月2日 上午11:11:09
	 * TODO 文本输出流
	 * 接口 Writer
	 * 实现类 FileWriter
	 */
	private static void fileOut()
	{
		try
		{
			File file = new File("D:/a.txt");
			//注意参数2为true为追加内容
			Writer fileWriter = new FileWriter(file,true);
			//追加文本内容
			fileWriter.write("aaaaaaaaaaaaaaaaa");
			//注意要刷新缓冲区
			fileWriter.flush();
			//一定要关闭
			fileWriter.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
