package com.gabriel.mvc.mover;

import com.gabriel.mvc.shapeimpl.Plane;
import com.gabriel.mvc.shapeimpl.Circle;
import com.gabriel.mvc.shapeimpl.Polygon;
import com.gabriel.mvc.shapesfx.MyMover;
import com.gabriel.mvc.shapesfx.MyShape;

public class PlaneMover implements MyMover{

	@Override
	public void move(MyShape shape, int dx, int dy) {
		
		Plane plane = (Plane) shape;
		
		//instantiate components
		Circle nose = plane.getNose();
		Circle body = plane.getBody();
		Polygon leftWing = plane.getLeftWing();
		Polygon rightWing = plane.getRightWing();
		Polygon leftFlap = plane.getLeftFlap();
		Polygon rightFlap = plane.getRightFlap();
		Circle tail = plane.getTail();
		Polygon leftFin = plane.getLeftFin();
		Polygon rightFin = plane.getRightFin();
		Circle cab = plane.getCab();
		Circle man = plane.getMan();
		Circle leftProp = plane.getLeftProp();
		Circle rightProp = plane.getRightProp();
				
		
		
		//instantiate movers
		CircleMover circleMover=new CircleMover();
		PolygonMover polygonMover = new PolygonMover();
		
		
		//set each components to movers
		circleMover.move(nose, dx, dy);
		circleMover.move(body, dx, dy);
		polygonMover.move(leftWing, dx, dy);
		polygonMover.move(rightWing, dx, dy);
		polygonMover.move(leftFlap, dx, dy);
		polygonMover.move(rightFlap, dx, dy);
		circleMover.move(tail, dx, dy);
		polygonMover.move(leftFin, dx, dy);
		polygonMover.move(rightFin, dx, dy);
		circleMover.move(cab, dx, dy);
		circleMover.move(man, dx, dy);
		circleMover.move(leftProp, dx, dy);
		circleMover.move(rightProp, dx, dy);
		
		
	}

}
