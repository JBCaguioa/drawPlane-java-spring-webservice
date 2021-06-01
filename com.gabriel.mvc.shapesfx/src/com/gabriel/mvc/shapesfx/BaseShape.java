package com.gabriel.mvc.shapesfx;

public class BaseShape implements MyShape{
    Location location;
	
	public BaseShape(){
		
	}
	
	public BaseShape(Location location) {
		this.location = location;
	}
	
	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location=location;
		
	}
	
}
