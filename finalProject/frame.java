package finalProject;

import java.awt.FlowLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;

class frame {
	static void main(){
	JFrame f = new JFrame("TITLE");
	
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

	gui.addGroupOfComponents("Monday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.TUESDAY);
	gui.addGroupOfComponents("Tuesday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.WEDNESDAY);
	gui.addGroupOfComponents("Wednesday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.THURSDAY);
	gui.addGroupOfComponents("Thursday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.FRIDAY);
	gui.addGroupOfComponents("Friday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.SATURDAY);
	gui.addGroupOfComponents("Saturday", groupContainer,week, today, currentDate);
	today = week.with(DayOfWeek.SUNDAY);
	gui.addGroupOfComponents("Sunday", groupContainer,week, today, currentDate);

	f.add(groupContainer);
	f.pack();
	f.setVisible(true);
	}
}
