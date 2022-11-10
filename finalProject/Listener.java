package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Listener {
	static void addButtonListener(JButton button, JTextField textField, JLabel label, JPanel day, JTextArea textArea) {
		ActionListener bListener = new ActionListener() {


		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			textArea.append(textField.getText()+ "\n");
			textField.setText("");
			textArea.setVisible(true);
			}
	};
	button.addActionListener(bListener);
	}
}
