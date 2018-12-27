package com.zhyyu.learn.ppp.principle.srp;

/**
 * 拆分 {@code Modem} 连接管理职责
 * @author zhyyu2016
 *
 */
public interface Connection {

	void dial(String pno);
	
	void hangup();
	
}
