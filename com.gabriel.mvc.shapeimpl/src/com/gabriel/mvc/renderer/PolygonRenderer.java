package com.gabriel.mvc.renderer;

import java.awt.Graphics;

import com.gabriel.mvc.shapeimpl.Polygon;
import com.gabriel.mvc.shapesfx.MyShape;
import com.gabriel.mvc.shapesfx.Renderer;

public class PolygonRenderer implements Renderer {
	@Override
	public void draw(Object object, MyShape shape) {
		Graphics g = (Graphics) object; 
		Polygon polygon= (Polygon) shape;
		
		int[] xpoints = new int[polygon.getXpoints().size()];
	    for (int i = 0; i < xpoints.length; i++)
	        xpoints[i] = polygon.getXpoints().get(i);
	    
	    int[] ypoints = new int[polygon.getYpoints().size()];
	    for (int i = 0; i < ypoints.length; i++)
	        ypoints[i] = polygon.getYpoints().get(i);
		
		g.fillPolygon(xpoints, ypoints, polygon.getNpoints());
	}
}
