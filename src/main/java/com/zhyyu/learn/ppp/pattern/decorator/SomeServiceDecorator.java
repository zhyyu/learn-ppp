package com.zhyyu.learn.ppp.pattern.decorator;

/**
 * 装饰者模式
 * <pre>
 * 1. SomeServiceDecorator添加接口实现类行为(before&after doSth), SomeServiceImpl接口实现类未知. 符合OCP
 * @author zhyyu2016
 *
 */
public class SomeServiceDecorator implements SomeService {

	private SomeService someService;
	
	public SomeServiceDecorator(SomeService someService) {
		this.someService = someService;
	}

	@Override
	public void doSomething() {
		beforeDoSomething();
		someService.doSomething();
		afterDoSomething();
	}
	
	private void beforeDoSomething() {
		System.out.println("beforeDoSomething");
	}
	
	private void afterDoSomething() {
		System.out.println("afterDoSomething");
	}

}
