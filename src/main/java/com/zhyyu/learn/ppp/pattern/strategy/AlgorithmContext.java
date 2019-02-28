package com.zhyyu.learn.ppp.pattern.strategy;

/**
 * 策略模式
 * <pre>
 * 1. AlgorithmContext 封装高层算法
 * 2. 具体实现委托给策略接口 Strategy
 * 3. 具体实现StrategyImpl1 实现 Strategy 接口
 * 
 * 和模板方法模式区别
 * 1. 策略模式具体实现依赖接口, 不耦合高层算法 			// 符合DIP 原则, 高层 AlgorithmContext 依赖抽象 Strategy, 细节StrategyImpl1 依赖抽象 Strategy
 * 2. 模板方法模式具体实现依赖高层算法(通过继承)			// 不符合DIP 原则
 * 3. 策略具体实现可供多种不同高层算法使用, 模板具体实现仅能给提供给一种高层算法(父类算法, 若父类算法修改则所有模板具体实现均修改)
 * 
 * @author zhyyu2016
 *
 */
public class AlgorithmContext {

	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doAlgorithm() {
		strategy.method1();
		strategy.method1();
	}
	
}
