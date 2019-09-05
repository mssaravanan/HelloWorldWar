package com.app;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.app.JavaLambda.MulFunction;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generic Type
		Container<Integer> container = new Container<Integer>();
		container.setValue(10);
		container.show();
		// Double braceslist
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
				
				
				
	    JavaLambda javaLambda = new JavaLambda();
		javaLambda.implementInterfaceLambda();
		javaLambda.internalIteration(arrayList);
		javaLambda.callByMethod(arrayList);
		
		JavaStream javaStream =new  JavaStream();
		javaStream.mapReduce();

	}

}







class Container<T> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}

	public void output(ArrayList<?> arrayList) {

	}

	public void output1(ArrayList<T> arrayList) {

	}

}

class Container1<T extends Number> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}

	public void output(ArrayList<? extends T> arrayList) {

	}

}

class Container3<T extends Number> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}

	public void output(ArrayList<? extends Number> arrayList) {

	}

	public void output2(ArrayList<? super Integer> arrayList) {

	}

	public void output3(MulFunction<? super Number> function) {

	}
}
