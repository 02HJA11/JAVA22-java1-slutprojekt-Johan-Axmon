package finalProject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.time.LocalDate;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class gui {
static void addGroupOfComponents(String text, JPanel container, LocalDate week, LocalDate today, int test) {
		
		JLabel label = new JLabel(text + " " + week.getMonth()  + " " + today.getDayOfMonth() );
		
		JLabel weekday = new JLabel();
		weekday.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField textField = new JTextField(text + " field", 20);
		textField.setMaximumSize(new Dimension(Short.MAX_VALUE, 500));
		
		
		JTextArea textArea = new JTextArea(20, 0);
		
		JButton button = new JButton("Add activity");
		
		JPanel day = new JPanel();
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		day.setLayout(new BoxLayout(day, BoxLayout.Y_AXIS));
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		listener.addButtonListener(button, textField, label, day, textArea);
		
		day.add(label);
		day.add(textArea);
		day.add(weekday);
		day.add(textField);
		day.add(button);
		if(test == today.getDayOfMonth()) {
			day.setBackground(Color.red);
		}
		
		day.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		container.add(day);
	}


}
