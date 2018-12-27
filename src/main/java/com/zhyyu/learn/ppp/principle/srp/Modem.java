package com.zhyyu.learn.ppp.principle.srp;

/**
 * 违反SRP(既有连接管理, 又有收发数据)
 * @author zhyyu2016
 *
 */
public interface Modem {

	void dial(String pno);
	
	void hangup();
	
	void send(char c);
	
	void recv();
	
}
