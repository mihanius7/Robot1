package edu.javacourse.robot;

import edu.javacourse.robot.ui.RobotFrame;
import javax.swing.JFrame;

public class RobotManager {
	public static void main(String[] args) {
		final int COUNT = 5;
		final int SIDE = 100;
		
		Robot robot = new Robot(200, 50);
		RobotListener listener = new SimpleRobotListener();
		robot.setListener(listener);
		
		for (int i = 0; i < COUNT; i++) {
			robot.forward(SIDE);
			robot.setCourse(robot.getCourse() + 360 / COUNT);
		}

		RobotFrame rf = new RobotFrame(robot);
		rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rf.setVisible(true);

		Robot[] robots = new Robot[10];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot(i * 10, i * 4);
			robots[i].printCoordinates();
		}

	}
}