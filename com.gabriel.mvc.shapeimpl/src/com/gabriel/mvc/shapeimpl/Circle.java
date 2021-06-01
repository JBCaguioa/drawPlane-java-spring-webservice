package com.gabriel.mvc.shapeimpl;

import com.gabriel.mvc.shapesfx.BaseShape;

public class Circle extends BaseShape {

    private int width;
	private int height;
	
	public Circle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}
