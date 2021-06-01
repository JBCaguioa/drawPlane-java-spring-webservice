package com.gabriel.mvc.renderer;

import java.awt.Graphics;

import com.gabriel.mvc.shapeimpl.Circle;
import com.gabriel.mvc.shapesfx.MyShape;
import com.gabriel.mvc.shapesfx.Renderer;

public class CircleRenderer implements Renderer{
	@Override
	public void draw(Object object, MyShape shape) {
		Graphics g = (Graphics) object; 
		Circle circle= (Circle) shape; 
		g.fillOval(circle.getLocation().getX(), circle.getLocation().getY(), circle.getHeight(), circle.getWidth());
	}
}
