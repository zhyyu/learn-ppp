package com.zhyyu.learn.ppp.pattern.observer;

/**
 * java 无多重继承, 使用委托方式实现(继承 Subject, 委托Clock 至成员变量)
 * @author zhyyu2016
 *
 */
public class ClockSubject extends Subject implements Clock {

	private Clock clock = new ClockImpl();

	@Override
	public void tic() {
		clock.tic();
		notifyObserver();
	}

	@Override
	public int getHours() {
		return clock.getHours();
	}

	@Override
	public int getMinutes() {
		return clock.getMinutes();
	}

	@Override
	public int getSeconds() {
		return clock.getSeconds();
	}
	
	
	
}
