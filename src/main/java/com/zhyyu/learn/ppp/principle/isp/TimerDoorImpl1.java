package com.zhyyu.learn.ppp.principle.isp;

/**
 * 违法ISP(接口隔离原则)
 * <pre>
 * 1. 无timeout 需求door(其他doorImpl) 不应该实现timeout 接口
 * @author zhyyu
 *
 */
public class TimerDoorImpl1 implements PollutedDoor {

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
