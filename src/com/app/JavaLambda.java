package com.app;

import java.util.ArrayList;
import java.util.function.Consumer;

class JavaLambda {
	
	@FunctionalInterface
	public interface AddFunction {

		int add(int x, int y);

		// int add2(int x, int y);

		// int add2(int x);

		default public void invoke() {
			System.out.println("SOP");
		}

		default public void invokedd() {
			System.out.println("SOP");
		}

	}

	public interface MulFunction<T> {

		T mul(T x, int T);

		public default void invoke() {
			System.out.println("SOP");
		}

	}

	public void implementInterfaceLambda() {
		// Implement the lambda expression
		AddFunction addFunction = (int x, int y) -> x + y;
		addFunction.invoke();
		System.out.println("Add Exp " + addFunction.add(10, 20));

		MulFunction<Float> mulFunction = (Float a, int b) -> a * b;

		System.out.println("Mul " + mulFunction.mul(20.4f, 2));
	}

	public void internalIteration(ArrayList<Integer> arrayList ) {
		
		// Consume Annotation
		// Internal Iteration
		arrayList.forEach((Integer i) -> System.out.println(i)); // Lamda annotation type1
		arrayList.forEach(i -> System.out.println(i)); // Lamda annotation type2
		arrayList.forEach(System.out::println); // method argument
		Consumer<Integer> consumer = new Consumer<Integer>() { // Interface class

			@Override
			public void accept(Integer arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0);
			}
		};

		arrayList.forEach(consumer);

		arrayList.forEach(new Consumer<Integer>() { // Inline Interface

			@Override
			public void accept(Integer arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0);
			}
		});

		
	}
	
	
	public void callByMethod(ArrayList<Integer> arrayList ) {
		// Call by method
				arrayList.forEach(System.out::println);

				arrayList.forEach(i -> calculate(i));

				arrayList.forEach(JavaLambda::calculate); // call by static method

				arrayList.forEach(new JavaLambda()::calculateAdd); // call by static method
	}

	// Call by method
	public static void calculate(int i) {

	}

	// Call by method
	public void calculateAdd(int i) {

	}
}