package finalProject;

import java.awt.FlowLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame {
	static void main(){
	JFrame f = new JFrame("Calendar");
	
	FlowLayout experimentLayout = new FlowLayout();
	f.setSize(800, 600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	JPanel groupContainer = new JPanel();
	LocalDate week = LocalDate.now();
	LocalDate today = LocalDate.now();
	LocalDate todayCheck = LocalDate.now();
	
	int currentDate = todayCheck.getDayOfMonth();

	groupContainer.setLayout(experimentLayout);
	
	today = week.with(DayOfWeek.MONDAY);

	Gui.addGroupOfComponents("Monday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.TUESDAY);
	Gui.addGroupOfComponents("Tuesday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.WEDNESDAY);
	Gui.addGroupOfComponents("Wednesday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.THURSDAY);
	Gui.addGroupOfComponents("Thursday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.FRIDAY);
	Gui.addGroupOfComponents("Friday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.SATURDAY);
	Gui.addGroupOfComponents("Saturday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.SUNDAY);
	Gui.addGroupOfComponents("Sunday", groupContainer,week, today, currentDate);

	f.add(groupContainer);
	f.pack();
	f.setVisible(true);
	}
}
