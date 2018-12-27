package com.zhyyu.learn.ppp.principle.ocp;

/**
 * OCP(开放闭合原则)
 * <pre>
 * 1. 对新增 someService 实现开放(仅需修改main 程序)
 * 2. 对修改context 闭合 
 * @author zhyyu2016
 *
 */
public class MainProgram {

	public static void main(String[] args) {
		SomeService someService = new SomeServiceImpl1();
		
		Context context = new Context();
		context.setSomeService(someService);
		
		context.doSth();
	}
	
}
