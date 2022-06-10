package edu.javacourse.move;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MoveSquareFrame extends JFrame {
	public static final String UP = "UP";
	public static final String DOWN = "DOWN";

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

		setBounds(100, 100, 400, 400);
	}
}
