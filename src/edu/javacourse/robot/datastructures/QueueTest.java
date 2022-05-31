package edu.javacourse.robot.datastructures;

public class QueueTest {
	public static void main(String[] arg) {
		ObjectQueue queue = new ObjectQueue();
		
		for (int i = 0; i < 10; i++) {
			queue.push("Text: " + i);
		}
		
		while (queue.size() > 0) {
			String s = (String) queue.pull();
			System.out.println(s);
			System.out.println("Queue size: " + queue.size());
		}
	}
}
