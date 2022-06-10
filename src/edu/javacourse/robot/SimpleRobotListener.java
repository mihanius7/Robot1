package edu.javacourse.robot;

public class SimpleRobotListener implements RobotListener {

	@Override
	public void startMove(double x, double y) {
		System.out.println("Robot started moving from (" + x + "; " + y + ")");
	}

	@Override
	public void endMove(double x, double y) {
		System.out.println("Robot finished moving at (" + x + "; " + y + ")");
	}

}
