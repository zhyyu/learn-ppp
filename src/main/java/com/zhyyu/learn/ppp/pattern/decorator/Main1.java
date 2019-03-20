package com.zhyyu.learn.ppp.pattern.decorator;

public class Main1 {

	public static void main(String[] args) {
		SomeService someService = new SomeServiceDecorator(new SomeServiceImpl());
		someService.doSomething();
	}
	
}
