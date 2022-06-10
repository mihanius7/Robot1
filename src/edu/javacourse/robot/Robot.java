package edu.javacourse.robot;

import edu.javacourse.robot.datastructures.ObjectQueue;

public class Robot {
	private double x = 0;
	private double y = 0;
	protected double course = 0;
	private ObjectQueue lines = new ObjectQueue();
	private RobotListener listener;

	public Robot(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setListener(RobotListener listener) {
		this.listener = listener;
	}

	public void printCoordinates() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public void forward(int distance) {
		if (listener != null) {
			listener.startMove(x, y);
		}
		final double xOld = x;
		final double yOld = y;
		x += distance * Math.cos(course / 180 * Math.PI);
		y += distance * Math.sin(course / 180 * Math.PI);
		if (listener != null) {
			listener.endMove(x, y);
		}
		lines.push(new RobotLine(xOld, yOld, x, y));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getCourse() {
		return course;
	}

	public void setCourse(double course) {
		this.course = course;
	}

	public ObjectQueue getLines() {
		return lines;
	}
}