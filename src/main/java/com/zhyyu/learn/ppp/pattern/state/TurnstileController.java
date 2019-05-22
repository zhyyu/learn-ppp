package com.zhyyu.learn.ppp.pattern.state;

public interface TurnstileController {

	void unlock();
	
	void lock();
	
	void refund();
	
	void alarm();
	
	void setStatus(TurnstileState turnstileState);
	
	TurnstileState getStatus();
	
}
