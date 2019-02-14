package com.zhyyu.learn.ppp.pattern.command;

import java.util.LinkedList;

public class ActiveObjectEngine {

	private LinkedList<Command> commandLinkedList = new LinkedList<>();
	
	public ActiveObjectEngine() {
		commandLinkedList.offer(new IdleCommand(this));
	}

	public void addCommand(Command command) {
		commandLinkedList.offer(command);
	}
	
	public void run() {
		while (!commandLinkedList.isEmpty()) {
			Command command = commandLinkedList.poll();
			command.execute();
		}
	}
	
	private static class IdleCommand implements Command {
		
		private ActiveObjectEngine activeObjectEngine;
		
		public IdleCommand(ActiveObjectEngine activeObjectEngine) {
			this.activeObjectEngine = activeObjectEngine;
		}

		@Override
		public void execute() {
			try {
				System.out.println("idle command executing...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// nothing to do
			}
			
			activeObjectEngine.addCommand(this);
		}
	}
	
}
