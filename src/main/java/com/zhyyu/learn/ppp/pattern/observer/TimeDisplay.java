package com.zhyyu.learn.ppp.pattern.observer;

/**
 * 观察者(本处使用拉模式
 * <pre>
 * 1. 使用拉模式需要有subject 引用
 * 2. 使用拉模式方便subjct, observer 抽取(notify, update 方法无需传递参数
 * 3. 拉模式适用于简单数据读取, 复杂数据适用推模式(若复杂数据适用拉模式, 不知哪部分数据更新
 * @author zhyyu2016
 *
 */
public class TimeDisplay implements Observer {

	private int hours;
	private int minutes;
	private int seconds;
	
	private Clock clock;
	
	public TimeDisplay(Clock clock) {
		this.clock = clock;
	}

	@Override
	public void update() {
		hours = clock.getHours();
		minutes = clock.getMinutes();
		seconds = clock.getSeconds();

		displayTime();
	}
	
	public void displayTime() {
		System.out.println("hours: " + hours + ", minutes: " + minutes + ", seconds: " + seconds);
	}

}
