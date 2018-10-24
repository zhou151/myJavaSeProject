package com.zhou.xmltest;

import java.io.InputStream;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DemoTest02 {
	public static void main(String[] args) {
		test01();
	}

	/**
	 * 
	 * @fun-name test01
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年10月17日 下午12:27:32
	 * TODO 数据库配置读取,xml方式
	 */
	private static void test01() {
		SAXReader sax=new SAXReader();
		InputStream resourceAsStream = DomTest01.class.getClassLoader().getResourceAsStream("com/zhou/xmltest/db.xml");
		Document read=null;
		try {
			read = sax.read(resourceAsStream);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element rootElement = read.getRootElement();
		System.out.println("--------------------------");
		System.out.println("根元素 <"+rootElement.getName()+">");
		System.out.println("--------------------------");
		String user = rootElement.elementText("user");
		String url = rootElement.elementText("url");
		String password = rootElement.elementText("password");
		String driver = rootElement.elementText("driver");
		System.out.println(user);
		System.out.println(url);
		System.out.println(password);
		System.out.println(driver);		
	}
}
