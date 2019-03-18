package com.zhyyu.learn.ppp.pattern.composite;

public class CommandImpl3 implements Command {

	@Override
	public void excute() {
		Command cmd1 = new CommandImpl1();
		Command cmd2 = new CommandImpl2();
		
		cmd1.excute();
		cmd2.excute();
	}

}
