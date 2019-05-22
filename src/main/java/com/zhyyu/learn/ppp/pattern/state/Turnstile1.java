package com.zhyyu.learn.ppp.pattern.state;

/**
 * 未使用状态模式
 * <pre>
 * 1. 状态机逻辑(coin & pass) 与 turnstile 逻辑(unlock & lock & reject & alarm) 耦合在一起
 * 2. 不同状态(LOCKED, UNLOCKED) 处理代码耦合在一起
 * @author zhyyu2016
 *
 */
public class Turnstile1 {

	private static final int LOCKED = 1;
	private static final int UNLOCKED = 2;
	
	/*private static final int COIN = 1;
	private static final int PASS = 2;*/
	
	private int status;

	public Turnstile1() {
		status = LOCKED;
	}
	
	public void coin() {
		if (status == LOCKED) {
			unlock();
			status = UNLOCKED;
		} else if (status == UNLOCKED) {
			reject();
		}
	}
	
	public void pass() {
		if (status == LOCKED) {
			alarm();
		} else if (status == UNLOCKED) {
			lock();
			status = LOCKED;
		}
	}
	
	
	private void unlock() {
		System.out.println("unlock");
	}
	
	private void lock() {
		System.out.println("lock");
	}
	
	private void reject() {
		System.out.println("reject");
	}
	
	private void alarm() {
		System.out.println("alarm");
	}
	
}
