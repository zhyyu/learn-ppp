package com.zhyyu.learn.ppp.principle.ocp_lsp;

public class Context {

	private SomeService someService;

	public void setSomeService(SomeService someService) {
		this.someService = someService;
	}
	
	public void doSth() {
		someService.doSth();
	}
	
}
