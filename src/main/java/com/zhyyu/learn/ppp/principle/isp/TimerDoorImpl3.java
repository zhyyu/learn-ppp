package com.zhyyu.learn.ppp.principle.isp;

/**
 * DoorTimerAdapter(隔离 Door, TimerClient 之间关系)
 * 
 * @author zhyyu
 *
 */
public class TimerDoorImpl3 implements TimerClient {

	private Door door;
	
	@Override
	public void timeout() {
		// do stn to door
		// door.lock();
	}

}
