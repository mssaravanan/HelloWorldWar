package com.app;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

class JavaStream{
	ArrayList<Integer> arrayList = new ArrayList<Integer>() {
		{
			add(10);
			add(20);
			add(30);
			add(40);
			add(50);
		}
	};
	
	ArrayList<String> strList = new ArrayList<String>() {
		{
			add("r");
			add("re");
			add("g");
			add("l");
			add("b");
		}
	};
	
	
	
	public void mapReduce () {
		int result=0;
		for(Integer i :arrayList) 
			result =result+i*2;
		System.out.println("For Loop :"+result);
		
		System.out.println("Reduce " + arrayList.stream().map(i-> i*2).reduce(0,(c,e)->c+e));
		System.out.println("Reduce " + arrayList.stream().map(i-> i*2).reduce(0,(c,e)->Integer.sum(c, e)));
		System.out.println("Reduce " + arrayList.stream().map(i-> i*2).reduce(0,Integer::sum)); // method reference 
		//Explanation
		
		Stream<Integer> stream1 =arrayList.stream();
		Stream<Integer> stream2= stream1.map(new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer arg0) {
				// TODO Auto-generated method stub
				return arg0*2;
			}
		});
		
		Optional<Integer> optional=stream2.reduce(new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0+arg1;
			}
		});
		
		optional.ifPresent(System.out::println);
	}
	
	
	public void streamForEach() {
		Stream<Integer> stream =arrayList.stream();
		
		stream.forEach(System.out::println);
		//stream.forEach(System.out::println); //Throws exception 
		arrayList.stream().sorted().findFirst().ifPresent(i->System.out.println(i));
		arrayList.stream().sorted().findFirst().ifPresent(System.out::println);
		arrayList.stream().forEachOrdered(System.out::println);
		System.out.println(strList.stream().filter(s-> {return s.startsWith("r".toString());}).map(String::toUpperCase));
	}
	
}