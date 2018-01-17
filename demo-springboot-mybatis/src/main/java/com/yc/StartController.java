package com.yc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author lzd
 *注意  这个类  下面的包才会被扫描到 所以这个类要放在最上层的目录里
 */
/*
 * @SpringBootApplication。 由于大量项目都会在主要的配置类上添加@Configuration,@EnableAutoConfiguration,@ComponentScan三个注解。
 * 因此Spring Boot提供了@SpringBootApplication注解，该注解可以替代上面三个注解（使用Spring注解继承实现）。
 */
@RestController //继承springmvc中的Controller	
@SpringBootApplication//这个等价于@Configuration,@EnableAutoConfiguration,@ComponentScan
public class StartController extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartController.class);
	}
	
	//main方法
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartController.class, args);
	}
}
