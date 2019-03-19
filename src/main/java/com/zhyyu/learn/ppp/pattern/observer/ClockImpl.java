package com.zhyyu.learn.ppp.pattern.observer;

import java.util.Random;

public class ClockImpl implements Clock {

	private int hours;
	private int minutes;
	private int seconds;
	
	@Override
	public void tic() {
		hours = new Random().nextInt(24);
		minutes = new Random().nextInt(60);
		seconds = new Random().nextInt(60);
	}

	@Override
	public int getHours() {
		return hours;
	}

	@Override
	public int getMinutes() {
		return minutes;
	}

	@Override
	public int getSeconds() {
		return seconds;
	}

}
