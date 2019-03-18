package com.zhyyu.learn.ppp.pattern.composite;

import java.util.Arrays;
import java.util.List;

public class Main1 {
	
	private List<Command> comositeCommandList = Arrays.asList(new CommandImpl1(), new CommandImpl2()); 

	public void doCompositeCommand() {
		for (Command command : comositeCommandList) {
			command.excute();
		}
	}
	
}
