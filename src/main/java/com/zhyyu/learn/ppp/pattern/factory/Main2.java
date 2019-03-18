package com.zhyyu.learn.ppp.pattern.factory;

/**
 * 工厂模式
 * <pre>
 * 1. 符合依赖倒置原则, Main2 不依赖底层Shape 具体实现
 * 2. 替换不同工厂, 可方便替换一组相关类(circle --> circle2, rectangle --> rectangle2)
 * @author zhyyu
 *
 */
public class Main2 {

	private ShapeFactory shapeFactory;
	
	public void setShapeFactory(ShapeFactory shapeFactory) {
		this.shapeFactory = shapeFactory;
	}
	
	void draw(String shape) {
		Shape shapeObj = shapeFactory.getShape(shape);
		shapeObj.draw();
	}
	
}
