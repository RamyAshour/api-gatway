package com.joi.api.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

//API Gatway (Zuul) + Service Registery (Eureka)
@SpringBootApplication
//@EnableZuulServer
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class ZuulServerApplication extends SpringBootServletInitializer{
 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            System.out.println("systesm       sssssssssss");
		return application.sources(ZuulServerApplication.class);
	}
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
