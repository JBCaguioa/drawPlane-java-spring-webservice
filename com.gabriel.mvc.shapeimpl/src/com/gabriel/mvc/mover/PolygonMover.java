package com.gabriel.mvc.mover;

import com.gabriel.mvc.shapeimpl.Polygon;
import com.gabriel.mvc.shapesfx.MyMover;
import com.gabriel.mvc.shapesfx.MyShape;

public class PolygonMover implements MyMover {
	@Override
	public void move(MyShape shape, int dx, int dy) {
		Polygon polygon = (Polygon) shape;
		
		for(int x = 0; x < polygon.getXpoints().size(); x++) {
			polygon.setNewXpoints(x, dx);
			polygon.setNewYpoints(x, dy);
		}
		
	}
}
