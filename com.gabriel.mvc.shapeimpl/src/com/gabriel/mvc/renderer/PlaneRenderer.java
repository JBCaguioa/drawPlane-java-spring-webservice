package com.gabriel.mvc.renderer;

import java.awt.Color;
import java.awt.Graphics;

import com.gabriel.mvc.shapeimpl.Plane;
import com.gabriel.mvc.shapeimpl.Circle;
import com.gabriel.mvc.shapeimpl.Polygon;
import com.gabriel.mvc.shapesfx.MyShape;
import com.gabriel.mvc.shapesfx.Renderer;

public class PlaneRenderer implements Renderer{

	@Override
	public void draw(Object object, MyShape shape) {
		
		Graphics g=(Graphics) object;
		Plane plane=(Plane) shape;
		
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
		
		//instantiate renderer
		CircleRenderer circleRenderer=new CircleRenderer();
		PolygonRenderer polygonRenderer=new PolygonRenderer();
		
		//set each components to renderer

		g.setColor(Color.gray);
		polygonRenderer.draw(g, leftFlap);
		
		g.setColor(Color.green);
		polygonRenderer.draw(g, leftWing);
		
		g.setColor(Color.darkGray);
		circleRenderer.draw(g, body);
		circleRenderer.draw(g, tail);
		
		g.setColor(Color.green);
		circleRenderer.draw(g, rightProp);
		
		g.setColor(Color.green);
		circleRenderer.draw(g, nose);
		
		g.setColor(Color.gray);
		polygonRenderer.draw(g, rightFlap);
		
		g.setColor(Color.green);
		polygonRenderer.draw(g, rightWing);
		
		polygonRenderer.draw(g, leftFin);
		polygonRenderer.draw(g, rightFin);
		
		g.setColor(Color.lightGray);
		circleRenderer.draw(g, cab);
		
		g.setColor(Color.pink);
		circleRenderer.draw(g, man);
		
		g.setColor(Color.green);
		circleRenderer.draw(g, leftProp);
	}

}
