package com.zhyyu.learn.ppp.principle.isp;

/**
 * 多重继承(隔离 Door, TimerClient 之间关系)
 * @author zhyyu
 *
 */
public class TimerDoorImpl2 implements Door, TimerClient {

	@Override
	public void timeout() {
	}
	
	@Override
	public void lock() {
	}

	@Override
	public void unlock() {
	}

	@Override
	public Boolean isDoorOpen() {
		return null;
	}

}
