package com.zhyyu.learn.ppp.pattern.adpater;

/**
 * 适配器模式
 * <pre>
 * 背景: 原有modem 接口, modemImpl123 实现, 后新增specificModem 接口及其实现, 并且使用modem 接口客户程序想直接使用specificModem 实现
 * 1. 为符合ISP, 应将modem 接口拆成两接口, dial&hangup, send&receive(specificModem). 单客户程序已使用modem 接口, 故不能改变
 * 2. 使用adapter 模拟specificModem 所没有的dial&hangup, specificModemImpl 不直接实现modem 接口(不要实现无需依赖接口
 * 3. 若modem 接口修改, specificModem 及其实现无需修改, 符合OCP
 * @author zhyyu2016
 *
 */
public class SpecificModemAdapter implements Modem {

	private SpecificModem specificModem;
	
	public SpecificModemAdapter(SpecificModem specificModem) {
		this.specificModem = specificModem;
	}

	@Override
	public void dial() {
		// mock dial
	}

	@Override
	public void hangup() {
		// mock hangup
	}

	@Override
	public void send() {
		specificModem.send();
	}

	@Override
	public void receive() {
		specificModem.receive();
	}

}
