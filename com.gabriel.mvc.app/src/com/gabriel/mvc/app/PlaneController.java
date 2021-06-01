package com.gabriel.mvc.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.gabriel.mvc.shapesfx.MyShape;
import com.gabriel.mvc.mover.PlaneMover;
import com.gabriel.mvc.shapesfx.Location;
import com.gabriel.mvc.shapesfx.Mover;

public class PlaneController extends JFrame implements ActionListener{
	PlaneView planeView;  
	MyShape plane;
	PlaneMover mover = new PlaneMover();
	JButton btnRight = new JButton("Right");
	JButton btnLeft = new JButton("Left");
	JButton btnUp = new JButton("Up");
	JButton btnDown= new JButton("Down");
	
	public void init(MyShape plane, PlaneView planeView ) {
		this.plane = plane;
		this.planeView = planeView;
	}
	
	
	public void initUI() {
		btnRight.setBounds(210,110,100,100);
		btnLeft.setBounds(10,110,100,100);
		btnUp.setBounds(110,10,100,100);
		btnDown.setBounds(110,210,100,100);
		
		add(btnRight);
		add(btnLeft);
		add(btnUp);
		add(btnDown);
		
		btnRight.addActionListener(this);
		btnLeft.addActionListener(this);
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		
		setLayout(null);
		setVisible(true);
		setBounds(500,10,500,500);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRight)
		{
			 mover.move(plane, 10, 0);			 
			 planeView.repaint();
		}
		else if(e.getSource() == btnLeft)
		{
			 mover.move(plane, -10, 0);			
			 planeView.repaint();
		}
		else if(e.getSource() == btnUp)
		{
			 mover.move(plane, 0, -10);			
			 planeView.repaint();
		}
		else if(e.getSource() == btnDown)
		{
			 mover.move(plane, 0, 10);
			 planeView.repaint();
		}	
		
	}
}
