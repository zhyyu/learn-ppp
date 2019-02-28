package com.zhyyu.learn.ppp.pattern.facade;

/**
 * 外观模式
 * <pre>
 * 1. 对用户提供简单接口 SimpleInterface, 隐藏复杂细节(ComplicatedClass12, ComplicatedInterface12...)
 * 2. 仅通过 SimpleInterface 操作复杂细节, SimpleInterface 成为细节唯一代理
 * @author zhyyu2016
 *
 */
public interface SimpleInterface {

	void simpleMethod();
	
}
