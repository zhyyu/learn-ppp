package com.zhyyu.learn.ppp.pattern.facade;

public class SimpleInterfaceImpl implements SimpleInterface {

	// 一些初始化
	private ComplicatedInterface1 complicatedInterface1;
	private ComplicatedInterface2 complicatedInterface2;
	
	@Override
	public void simpleMethod() {
		// 一些复杂的操作
		ComplicatedClass1 complicatedClass1 = new ComplicatedClass1();
		ComplicatedClass1 complicatedClass2 = new ComplicatedClass1();
		
		complicatedInterface1.complicatedMethod1();
		complicatedInterface2.complicatedMethod2();
		
		// ...
	}
	
}
