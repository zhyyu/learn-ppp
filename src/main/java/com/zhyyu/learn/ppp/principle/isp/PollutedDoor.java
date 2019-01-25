package com.zhyyu.learn.ppp.principle.isp;

/**
 * 污染了Door 接口, 使所有的Door 实现都必须实现  TimerClient
 * @author zhyyu2016
 *
 */
public interface PollutedDoor extends TimerClient {

	void lock();
	
	void unlock();
	
	Boolean isDoorOpen();
	
}
