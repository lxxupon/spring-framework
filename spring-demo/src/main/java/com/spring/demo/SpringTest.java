package com.spring.demo;

import com.spring.demo.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		User bean = configApplicationContext.getBean(User.class);
		bean.sayHello();
	}

	@Configuration
	static class DemoConfig{
		@Bean
		public User user(){
			User user = new User();
			user.setName("中追踪那个");
			return user;
		}
	}
}
