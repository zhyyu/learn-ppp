package com.zhyyu.learn.ppp.principle.dip;

/**
 * DIP(依赖倒置原则), 底层模块修改不会影响高层策略
 * <pre>
 * 1. 高层模块不应该依赖底层模块, 二者都应该依赖于抽象(LampOwner, Lamp 均依赖于 ButtonService 抽象)
 * 2. 抽象不应该依赖于细节, 细节应该依赖于抽象(Lamp 依赖于ButtonService)
 * @author zhyyu2016
 *
 */
public class LampOwner {

	private ButtonService buttonService;

	public ButtonService getButtonService() {
		return buttonService;
	}

	public void setButtonService(ButtonService buttonService) {
		this.buttonService = buttonService;
	}
	
	public void turnOnLamp() {
		buttonService.turnOn();
	}
	
	public void turnOffLamp() {
		buttonService.turnOn();
	}
	
}
