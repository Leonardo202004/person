package com.fengzhiwei.common.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Person {
    private BigInteger id;
	private String name;
	private BigDecimal money;
	private Integer age;
	private Date create;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(BigInteger id, String name, BigDecimal money, Integer age, Date create) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.age = age;
		this.create = create;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", money=" + money + ", age=" + age + ", create=" + create + "]";
	}
	
}
