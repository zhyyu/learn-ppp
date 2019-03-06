package com.zhyyu.learn.ppp.pattern.singleton;

/**
 * 单例模式(饿汉式)
 * @author zhyyu2016
 *
 */
public class ASingleton {

	private static final ASingleton aSingleton = new ASingleton();
	
	private ASingleton() {
	}
	
	public static ASingleton getASingleton() {
		return aSingleton;
	}
	
}
