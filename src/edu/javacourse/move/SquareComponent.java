package edu.javacourse.move;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class SquareComponent extends JComponent implements ActionListener {

	private static final int SQUARE_SIZE = 30;
	private static final int STEP = 10;
	private int x = 0;
	private int y = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton clickedButton = (JButton) e.getSource();
			if (clickedButton.getActionCommand().equals(MoveSquareFrame.UP)) {
				y -= STEP;
			}
			if (clickedButton.getActionCommand().equals(MoveSquareFrame.DOWN)) {
				y += STEP;
			}
			if (clickedButton.getActionCommand().equals(MoveSquareFrame.LEFT)) {
				x -= STEP;
			}
			if (clickedButton.getActionCommand().equals(MoveSquareFrame.RIGHT)) {
				x += STEP;
			}
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
	}

}
