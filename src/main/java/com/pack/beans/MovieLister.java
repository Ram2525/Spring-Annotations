package com.pack.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MovieLister {
	
	@Value("${movie.year}")
	private Integer year;
	
	@Autowired
	private MovieFinder finder;
	
	@PostConstruct
	public void setUp() {
		System.out.println("setUp()---------Called");
	}
	@PreDestroy
	public void tearDown()
	{
		System.out.println("tearDown()-----called");
	}
	
	public String displayMovie()
	{
		String str=finder.findMovieByYear(year);
		return str;
	}

}
