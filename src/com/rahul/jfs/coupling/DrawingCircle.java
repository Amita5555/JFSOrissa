package com.rahul.jfs.coupling;

public class DrawingCircle {

	private Circle circle;


	public DrawingCircle(Circle circle) {
		super();
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "Drawing [circle=" + circle + "]";
	}
	public void draw() {
		System.out.println(circle);
	}

}
