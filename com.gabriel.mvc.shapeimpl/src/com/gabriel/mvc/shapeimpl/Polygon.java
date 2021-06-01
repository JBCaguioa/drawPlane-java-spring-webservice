package com.gabriel.mvc.shapeimpl;

import java.util.List;

import com.gabriel.mvc.shapesfx.BaseShape;

public class Polygon extends BaseShape {
	private List<Integer> xpoints;
	private List<Integer> ypoints;
	private int npoints;
	
	public Polygon(List<Integer> xpoints, List<Integer> ypoints, int npoints) {
		super();
		this.xpoints = xpoints;
		this.ypoints = ypoints;
		this.npoints = npoints;
	}
	
	public void setNewXpoints(int i, int dx) {
		this.xpoints.set(i, this.xpoints.get(i)+dx);
	}

	public void setNewYpoints(int i, int dy) {
		this.ypoints.set(i, this.ypoints.get(i)+dy);
	}

	public List<Integer> getXpoints() {
		return xpoints;
	}

	public List<Integer> getYpoints() {
		return ypoints;
	}

	public int getNpoints() {
		return npoints;
	}
}
