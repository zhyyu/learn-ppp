package com.zhyyu.learn.ppp.pattern.factory;

public class ShapeFactoryImpl2 implements ShapeFactory {

	@Override
	public Shape getShape(String shape) {
		if ("circle".equals(shape)) {
			return new Circle2();
		} else {
			return new Rectangle2();
		}
	}

}
