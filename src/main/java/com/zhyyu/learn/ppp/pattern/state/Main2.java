package com.zhyyu.learn.ppp.pattern.state;

public class Main2 {

	public static void main(String[] args) {
		Turnstile2 turnstile2 = new Turnstile2();
		TurnstileState turnstileState = turnstile2.getStatus();
		System.out.println(turnstileState);
		
		turnstileState.pass();
		turnstileState.coin();
	}
	
}
