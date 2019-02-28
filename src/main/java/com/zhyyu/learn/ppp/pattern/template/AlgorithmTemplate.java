package com.zhyyu.learn.ppp.pattern.template;

/**
 * 模板方法模式
 * <pre>
 * 1. AlgorithmTemplate 模板封装高层算法
 * 2. ConcreteImpl1 子类具体实现
 * @author zhyyu2016
 *
 */
public abstract class AlgorithmTemplate {

	public void doAlgorithm() {
		method1();
		method2();
	}
	
	protected void method1() {
	}
	
	protected void method2() {
	}
	
}
