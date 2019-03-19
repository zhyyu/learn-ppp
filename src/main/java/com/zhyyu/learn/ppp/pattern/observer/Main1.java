package com.zhyyu.learn.ppp.pattern.observer;

/**
 * 观察者模式
 * <pre>
 * 1. 解耦subject 与observer, 添加observer 对subjct 无影响 (OCP
 * 2. subject, timeDisplay 均依赖observer 接口 (DIP
 * 3. ClockSubject, 合并clock subject(ISP
 * @author zhyyu2016
 *
 */
public class Main1 {

	public static void main(String[] args) {
		ClockSubject clockSubject = new ClockSubject();
		Observer timeDisplay1 = new TimeDisplay(clockSubject);
		Observer timeDisplay2 = new TimeDisplay(clockSubject);
		
		clockSubject.registerObserver(timeDisplay1);
		clockSubject.registerObserver(timeDisplay2);
		
		clockSubject.tic();
	}
	
}
