package com.zhyyu.learn.ppp.pattern.state;

public class TurnstileLockedState implements TurnstileState {
	
	private TurnstileController turnstileController;

	public TurnstileLockedState(TurnstileController turnstileController) {
		this.turnstileController = turnstileController;
	}

	@Override
	public void coin() {
		turnstileController.unlock();
		turnstileController.setStatus(new TurnstileUnlockedState(turnstileController));
	}

	@Override
	public void pass() {
		turnstileController.alarm();
	}
	
	@Override
	public String toString() {
		return "locked status";
	}

}
 