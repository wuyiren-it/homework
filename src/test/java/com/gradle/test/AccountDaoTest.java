package com.gradle.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gradle2.dao.AccountDao;

public class AccountDaoTest {
    @Test
	public void account() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		AccountDao accountdDa0 =	ac.getBean(AccountDao.class);
		accountdDa0.finl();
	}

}
