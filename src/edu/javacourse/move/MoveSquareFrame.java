package edu.javacourse.move;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MoveSquareFrame extends JFrame {
	public static final String UP = "UP";
	public static final String DOWN = "DOWN";
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";

	public MoveSquareFrame() {
		SquareComponent sc = new SquareComponent();
		add(sc);

		JButton buttonUp = new JButton(UP);
		buttonUp.setActionCommand(UP);
		buttonUp.addActionListener(sc);
		add(buttonUp, BorderLayout.NORTH);

		JButton buttonDown = new JButton(DOWN);
		buttonDown.setActionCommand(DOWN);
		buttonDown.addActionListener(sc);
		add(buttonDown, BorderLayout.SOUTH);
		
		JButton buttonLeft = new JButton(LEFT);
		buttonLeft.setActionCommand(LEFT);
		buttonLeft.addActionListener(sc);
		add(buttonLeft, BorderLayout.WEST);
		
		JButton buttonRight = new JButton(RIGHT);
		buttonRight.setActionCommand(RIGHT);
		buttonRight.addActionListener(sc);
		add(buttonRight, BorderLayout.EAST);

		setBounds(100, 100, 400, 400);
	}
}
