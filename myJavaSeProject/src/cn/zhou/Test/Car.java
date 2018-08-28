package cn.zhou.Test;

public class Car
{
	public String name;
	public String color;
	public Integer price;
	@Override
	/**
	 * 
	 * @fun-name sale
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年8月27日 下午10:57:10
	 * TODO 重写equals方法
	 */
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(!(obj instanceof Car))
			return false;
		if(this.name.equals(((Car)obj).name)&&this.color.equals(((Car)obj).color))
			return true;
		return false;
	}
	
	
	public Car(String name, String color, Integer price)
	{
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
	
}
