package com.fengzhiwei.common.utils;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.fengzhiwei.common.domain.Person;

public class TestPerson {

	@Test
	public void test() {
		for (int i = 0; i < 100; i++) {
			Person person = new Person();
			person.setId(BigInteger.valueOf(i+1));
			person.setName(StringUtils.getName());
			person.setAge(RondomUtils.random(1, 100));
			Calendar calendar = Calendar.getInstance();
			calendar.set(2012, 0, 1);
			Date date = DateUtils.random(calendar.getTime(), new Date());
			person.setCreate(date);
			
			System.out.println(person);
		}
	}

}
