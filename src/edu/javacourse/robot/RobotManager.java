package edu.javacourse.robot;

import edu.javacourse.robot.ui.RobotFrame;
import javax.swing.JFrame;

public class RobotManager {
	public static void main(String[] args) {
		final int COUNT = 8;
		final int SIDE = 128;
		
		Robot robot = new Robot(175, 50);
		RobotListener listener = new SimpleRobotListener();
		robot.setListener(listener);
		
		for (int i = 0; i < COUNT; i++) {
			robot.forward(SIDE);
			robot.setCourse(robot.getCourse() + 360 / COUNT);
		}
		
		robot.setCourse(90);
		robot.forward(256);
		robot.setCourse(0);
		robot.forward(128);
		robot.setCourse(-90);
		robot.forward(256);

		RobotFrame rf = new RobotFrame(robot);
		rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rf.setVisible(true);

	}
}