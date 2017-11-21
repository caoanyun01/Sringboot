package com.mengke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mengke.bean.User;
import com.mengke.mapper.user.IUsermapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFreemakerApplicationTests {

	@Autowired 
	IUsermapper iUsermapper;
	@Test
	public void contextLoads() {
		User users=new User();
		users.setUsername("xxx00544");
		users.setPassword("123456");
		User user=iUsermapper.user(users);
		System.out.println(user.getUsername());
	}

}
