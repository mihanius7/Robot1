package edu.javacourse.robot;

public class SimpleRobotListener implements RobotListener {

	@Override
	public void startMove(double x, double y) {
		System.out.format("Robot started moving from (%.1f; %.1f) m.%n", x, y);
	}

	@Override
	public void endMove(double x, double y) {
		System.out.format("Robot finished moving at (%.1f; %.1f) m.%n", x, y);
	}

}
