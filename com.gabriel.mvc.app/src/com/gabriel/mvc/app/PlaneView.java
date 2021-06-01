package com.gabriel.mvc.app;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.gabriel.mvc.renderer.PlaneRenderer;
import com.gabriel.mvc.shapesfx.MyShape;
import com.gabriel.mvc.shapesfx.Renderer;

public class PlaneView extends JFrame {
	MyShape plane;
	Renderer renderer = new PlaneRenderer();
	void init(MyShape plane) {
		this.plane = plane;
	}
	void initUI() {		
		setLayout(null);
		setVisible(true);
		setSize(500,500);
	}
	
	public void paint(Graphics g)
	{
		g.clearRect(0,0,600,600);
		renderer.draw(g, plane);
	}
}
