package com.zhyyu.learn.ppp.pattern.command;

public class ActiveObjectEngineTest {

	public static void main(String[] args) {
		ActiveObjectEngine activeObjectEngine = new ActiveObjectEngine();
		startAddCommandThread(activeObjectEngine);
		activeObjectEngine.run();
	}

	private static void startAddCommandThread(ActiveObjectEngine activeObjectEngine) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					activeObjectEngine.addCommand(new Command() {
						@Override
						public void execute() {
							System.out.println("test command executing...");
						}
					});
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		}).start();
	}
	
}
