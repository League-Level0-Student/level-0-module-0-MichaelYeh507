package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwsome {

	public static void main(String[] args) {
		String awsomeThing = JOptionPane.showInputDialog(null, "What do you think is awsome");
		JOptionPane.showMessageDialog(null, awsomeThing + " is awsome!");
		
	}
}
