package com.gabriel.mvc.shapeimpl;

import com.gabriel.mvc.shapesfx.BaseShape;

public class Plane extends BaseShape{

	//nose
	private Circle nose;
	
	//body
	private Circle body;
	
	//wings
	private Polygon leftWing;
	private Polygon rightWing;
	
	//flap
	private Polygon leftFlap;
	private Polygon rightFlap;
	
	//tail
	private Circle tail;
	
	//fins
	private Polygon leftFin;
	private Polygon rightFin;
	
	//Cab
	private Circle cab;
	private Circle man;
	
	//propeller
	private Circle leftProp;
	private Circle rightProp;
	
	//constructor
	public Plane(Circle nose, Circle body, Polygon leftWing, Polygon rightWing, Polygon leftFlap, Polygon rightFlap,
			Circle tail, Polygon leftFin, Polygon rightFin, Circle cab, Circle man, Circle leftProp, Circle rightProp) {
		super();
		this.nose = nose;
		this.body = body;
		this.leftWing = leftWing;
		this.rightWing = rightWing;
		this.leftFlap = leftFlap;
		this.rightFlap = rightFlap;
		this.tail = tail;
		this.leftFin = leftFin;
		this.rightFin = rightFin;
		this.cab = cab;
		this.man = man;
		this.leftProp = leftProp;
		this.rightProp = rightProp;
	}

	//getters
	public Circle getNose() {
		return nose;
	}


	public Circle getBody() {
		return body;
	}


	public Polygon getLeftWing() {
		return leftWing;
	}


	public Polygon getRightWing() {
		return rightWing;
	}


	public Polygon getLeftFlap() {
		return leftFlap;
	}


	public Polygon getRightFlap() {
		return rightFlap;
	}


	public Circle getTail() {
		return tail;
	}


	public Polygon getLeftFin() {
		return leftFin;
	}


	public Polygon getRightFin() {
		return rightFin;
	}


	public Circle getCab() {
		return cab;
	}


	public Circle getMan() {
		return man;
	}


	public Circle getLeftProp() {
		return leftProp;
	}


	public Circle getRightProp() {
		return rightProp;
	}

}
