package com.zhyyu.learn.ppp.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题抽象类
 * @author zhyyu2016
 *
 */
public abstract class Subject {

	private List<Observer> observerList = new ArrayList<>();
	
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}
	
	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
	
}
