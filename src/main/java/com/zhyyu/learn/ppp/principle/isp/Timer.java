package com.zhyyu.learn.ppp.principle.isp;

public interface Timer {

	void register(Integer timeoutSeconds, TimerClient timerClient);
	
}
