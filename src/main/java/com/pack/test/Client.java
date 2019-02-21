package com.pack.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.beans.MovieLister;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
		
		MovieLister lister =(MovieLister)ctx.getBean("movieLister");
		
		System.out.println(lister.displayMovie());
		ctx.close();
	}

}
