package com.gabriel.mvc.mover;

import com.gabriel.mvc.shapeimpl.Circle;
import com.gabriel.mvc.shapesfx.MyMover;
import com.gabriel.mvc.shapesfx.MyShape;

public class CircleMover implements MyMover {
	@Override
	public void move(MyShape shape, int dx, int dy) {
		Circle circle = (Circle) shape;
		circle.getLocation().setX(circle.getLocation().getX()+dx);
		circle.getLocation().setY(circle.getLocation().getY()+dy);
		
	}
}
