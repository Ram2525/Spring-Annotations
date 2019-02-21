package com.pack.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MovieFinder {
	
	static Map<Integer,String> theMap= new HashMap<Integer,String>();
	
	static
	{
		theMap.put(2014,"Legend");
		theMap.put(2015,"Bahubali");
		theMap.put(2016,"Janata");
	}
	

	public String findMovieByYear(int year) {
		String str=(String)theMap.get(year);
		return str;
	}

}
