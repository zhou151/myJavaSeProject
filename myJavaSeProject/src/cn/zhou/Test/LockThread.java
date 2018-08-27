package cn.zhou.Test;


/**
 * 
 * @author Mr_zhou
 * 2018年8月17日 下午7:45:30
 * TODO 线程锁同步示例
 */
public class LockThread implements Runnable
{

	private volatile int num = 100;
	@Override
	public void run()
	{
		for (; num > 0;)
		{
			sale();
		}
	}
	/**
	 * 
	 * @fun-name sale
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月27日 下午10:57:10
	 * TODO
	 */
	public synchronized void sale()
	{
		if (num > 0)
		{
			int quantity = 100 - num + 1;
			System.out.println(Thread.currentThread().getName() + "出售第" + quantity);
			--num;
		}else {
			System.out.println("票已经售完");
		}
	}

	public static void main(String[] args)
	{
		LockThread testThread = new LockThread();
		Thread thread = new Thread(testThread, "窗口1");
		Thread thread1 = new Thread(testThread, "窗口2");
		thread.start();
		thread1.start();
	}
}
