package com.zhyyu.learn.ppp.pattern.state;

public class TurnstileUnlockedState implements TurnstileState {
	
	private TurnstileController turnstileController;

	public TurnstileUnlockedState(TurnstileController turnstileController) {
		this.turnstileController = turnstileController;
	}

	@Override
	public void coin() {
		turnstileController.refund();
	}

	@Override
	public void pass() {
		turnstileController.lock();
		turnstileController.setStatus(new TurnstileLockedState(turnstileController));
	}
	
	@Override
	public String toString() {
		return "unlocked status";
	}

}
 