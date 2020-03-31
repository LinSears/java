package com.company;

public class Main {

	public static void main(String[] args) {
		Lambda l = new Lambda();
		// 1 способ: без использования лямбда-выражений
		l.setOnWorkListener(new Lambda.doSomething() {
			@Override
			public void doWork(String name) {
				System.out.println(name);
			}
		});
		// 2 вариант: с использованием лямбда-выражений
		l.setOnWorkListener( s -> {
			//this.clone(); // this = Main
			System.out.println(s);
		});
	}
}
