package com.zhou.xmltest;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DomTest01 {
	public static void main(String[] args) {
		test01();
	}
	
	/**
	 * 
	 * @fun-name test01
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年10月17日 上午9:18:12
	 * TODO xml解析方式dom4j
	 */
	public static void test01() {
		SAXReader sax=new SAXReader();
		InputStream resourceAsStream = DomTest01.class.getClassLoader().getResourceAsStream("com/zhou/xmltest/myxml.xml");
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
		Iterator <Element> elementIterator = rootElement.elementIterator();
		for (;elementIterator.hasNext();) {
			Element ele = elementIterator.next();
			System.out.println("二级元素  <"+ele.getName()+">");
			List<Element> elements = ele.elements();
			for(Element e:elements) {
				System.out.println("三级元素  <"+e.getName()+">的值 : "+e.getTextTrim());
			}
			System.out.println("--------------------------");
		}
	}
}
