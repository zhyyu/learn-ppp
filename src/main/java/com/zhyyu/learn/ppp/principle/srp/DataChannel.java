package com.zhyyu.learn.ppp.principle.srp;

/**
 * 拆分 {@code Modem} 收发数据职责
 * @author zhyyu2016
 *
 */
public interface DataChannel {

	void send(char c);
	
	void recv();
	
}
