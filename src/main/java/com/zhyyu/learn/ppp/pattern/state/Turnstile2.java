package com.zhyyu.learn.ppp.pattern.state;

/**
 * 状态模式
 * <pre>
 * 1. 分离状态机转换逻辑(TurnstileState) 与对应行为(TurnstileController)
 * 2. 符合DIP Turnstile2&TurnstileLockedState 均依赖TurnstileState 抽象, 类似策略模式
 * 3. 符合OCP 增加新TurnstileState 实现, 对Turnstile2 无影响, 修改Turnstile2 对 TurnstileState 实现无影响
 * 4. 符合SRP, 某一状态, 如TurnstileLockedState, 仅对自己状态逻辑负责
 * @author zhyyu2016
 *
 */
public class Turnstile2 implements TurnstileController {

	private TurnstileState turnstileState = new TurnstileLockedState(this);
	
	@Override
	public void unlock() {
		System.out.println("unlock");
	}

	@Override
	public void lock() {
		System.out.println("lock");
	}

	@Override
	public void refund() {
		System.out.println("refund");
	}

	@Override
	public void alarm() {
		System.out.println("alarm");
	}

	@Override
	public void setStatus(TurnstileState turnstileState) {
		this.turnstileState = turnstileState;
	}

	@Override
	public TurnstileState getStatus() {
		return turnstileState;
	}

}
