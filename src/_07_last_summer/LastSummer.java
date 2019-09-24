package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {

	public static void main(String[] args) {
		String activity = JOptionPane.showInputDialog(null, "What did you do over the summer?");
		JOptionPane.showMessageDialog(null, "You " + activity + " for the summer.");
	}
}
