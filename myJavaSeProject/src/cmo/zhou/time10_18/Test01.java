package cmo.zhou.time10_18;

public class Test01 {
	
	
	/**
	 * 
	 * @Deprecated  将方法标识为过时,对调用无影响
	 * @SuppressWarnings("all")  抑制编译警告
	 * 
	 * */
	
	@SuppressWarnings("all")
	@Deprecated
	public void print() {
		
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000L; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时 "+(end-start)+" 毫秒");
	}
}
