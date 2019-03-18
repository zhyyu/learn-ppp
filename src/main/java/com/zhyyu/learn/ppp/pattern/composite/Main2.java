package com.zhyyu.learn.ppp.pattern.composite;

/**
 * 组合模式
 * <pre>
 * 1. main -> command 一对多关系变为一对一关系
 * 2. 符合DIP, 复杂command 细节(如调用cmd1 后调用cmd2) 对Main 不可见
 * @author zhyyu
 *
 */
public class Main2 {

	private Command comositeCommand;
	
	// set CommandImpl3
	public void setComositeCommand(Command command) {
		this.comositeCommand = command;
	}

	public void doCompositeCommand() {
		comositeCommand.excute();
	}
	
}
