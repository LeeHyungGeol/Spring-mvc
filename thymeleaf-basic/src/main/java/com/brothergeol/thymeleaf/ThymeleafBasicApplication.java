package com.brothergeol.thymeleaf;

import com.brothergeol.thymeleaf.basic.BasicController.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThymeleafBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(ThymeleafBasicApplication.class, args);
//		HelloBean bean = ac.getBean(HelloBean.class);
//		for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
//			System.out.println("beanDefinitionName = " + beanDefinitionName);
//		}
	}

}
