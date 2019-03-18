package com.zhyyu.learn.ppp.pattern.factory;

public class ShapeFactoryImpl1 implements ShapeFactory {

	@Override
	public Shape getShape(String shape) {
		if ("circle".equals(shape)) {
			return new Circle();
		} else {
			return new Rectangle();
		}
	}

}
