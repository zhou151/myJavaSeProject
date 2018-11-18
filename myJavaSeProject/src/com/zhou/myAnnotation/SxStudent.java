package com.zhou.myAnnotation;


@SxtTable("u_table")
public class SxStudent {
	
	@SxtField(column="s_id",length=5,type="int")
	private Integer id;
	
	@SxtField(column="s_name",type="varchar",length=15)
	private String name;
	
	@SxtField(column="s_age",length=4,type="int")
	private Integer age;
	
	private void print() {
		System.out.println("ok");
	}
	
	public void print01(String str) {
		System.out.println(str);
	}
	
	public SxStudent() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SxStudent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public SxStudent(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
