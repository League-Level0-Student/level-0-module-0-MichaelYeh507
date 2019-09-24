import javax.swing.JOptionPane;

public class SecretMessage {

public static void main(String[] args) {
	
	String password = "java";
	String answer = JOptionPane.showInputDialog(null, "What is the password?");
	JOptionPane.showMessageDialog(null, "You can only see the message if you get the password right");

	if (answer.equals("java")) {
		JOptionPane.showMessageDialog(null, "Secret message: xd");
	} else {
		JOptionPane.showMessageDialog(null, "Intruder!");
		
	}
	
}
	
}
