package com.zhou.pattern;

/**
 * 
 * @author Mr_zhou
 * 2018年9月5日 上午11:10:13
 * TODO 单例模式-双重校验锁（DCL，即 double-checked locking）
 * TODO 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class Singleton
{
	private static volatile Singleton obj = null;
	private Singleton()
	{
		
	}
	public static Singleton getObj()
	{
		if (obj == null)
		{
			synchronized (Singleton.class)
			{
				if (obj == null)
				{
					obj=new Singleton();
				}
			}
		}
		return obj;
	}
}
