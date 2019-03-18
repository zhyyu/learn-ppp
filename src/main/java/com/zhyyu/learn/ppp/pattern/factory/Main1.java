package com.zhyyu.learn.ppp.pattern.factory;

/**
 * Main1 直接依赖具体实现 Circle&Rectangle, 违反DIP, 上层依赖底层细节
 * @author zhyyu
 *
 */
public class Main1 {

	void draw(String shape) {
		Shape shapeObj = null;
		if ("circle".equals(shape)) {
			shapeObj = new Circle();
		} else {
			shapeObj = new Rectangle();
		}
		
		shapeObj.draw();
	}
	
}
