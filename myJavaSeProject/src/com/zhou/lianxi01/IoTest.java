package com.zhou.lianxi01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IoTest
{
	public static void main(String[] args)
	{
		//fileOut();
		//fileInput();
		//myOutPutstream();
		//myInputstream();
		myCopy();
	}

	
	/**
	 * 
	 * @fun-name myCopy
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月2日 下午1:30:04
	 * TODO 字节流复制文件操作
	 */
	private static void myCopy()
	{
		
		try
		{
			//-----------------------------------------------------
			File file = new File("D:/tx.jpg");
			InputStream fileInputStream = new FileInputStream(file);
			
			//这里的file01如果不存在会自动创建
			File file01 = new File("E:/tx.jpg");
			OutputStream fileOutputStream = new FileOutputStream(file01);
			
			byte [] byteArr=new byte[8];
			for(int len=0;(len=fileInputStream.read(byteArr))!=-1;)
			{
				fileOutputStream.write(byteArr, 0, len);
				fileOutputStream.flush();
			}
			//注意关闭流,先开后关
			fileOutputStream.close();
			fileInputStream.close();
			System.out.println("完成");
			//-----------------------------------------------------
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @fun-name myInputstream
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月2日 下午12:12:17
	 * TODO 字节输入流,(读文件)
	 * 接口  InputStream
	 * 实现类  FileInputStream
	 */
	private static void myInputstream()
	{
		try
		{
			//-----------------------------------------------------
			File file = new File("D:/a.txt");
			InputStream fileInputStream = new FileInputStream(file);
			//读小文件建议写法
			/*byte [] byteArr=new byte[(int)file.length()];
			fileInputStream.read(byteArr);*/
			
			//方式二,边读边输出,每次读8个字符,性能更高,建议写法
			byte [] byteArr=new byte[8];
			int len=0;
			for(;(len=fileInputStream.read(byteArr))!=-1;)
			{
				System.out.println(new String(byteArr,0,len));
			}
			fileInputStream.close();
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
	 * @fun-name MyoutPutstream
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月2日 下午12:07:16
	 * TODO  字节输出流输出文本demo
	 * 接口 OutputStream
	 * 实现类  FileOutputStream
	 */
	private static void myOutPutstream()
	{
		try
		{
			//-----------------------------------------------------
			OutputStream fileOutputStream = new FileOutputStream(new File(""),true);
			
			String str="sddssd";
			
			fileOutputStream.write(str.getBytes());
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
			//-----------------------------------------------------
			File file = new File("D:/a.txt");
			//注意参数2为true为追加内容
			Writer fileWriter = new FileWriter(file,true);
			//追加文本内容
			fileWriter.write("aaaaaaaaaaaaaaaaa");
			//注意要刷新缓冲区
			fileWriter.flush();
			//一定要关闭
			fileWriter.close();
			//-----------------------------------------------------
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
