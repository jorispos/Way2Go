import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	JPanel titlePanel;
	JFrame window = new JFrame("Way2Go");
	Color backgroundColor = new Color(35, 35, 0);
	Container cons;
	
	public Window() {
		
	}
	
	
	public void createWindow() {
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(backgroundColor);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		cons = window.getContentPane();
		
		titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 860, 100);
		titlePanel.setBackground(backgroundColor);
		cons.add(titlePanel);
	}
	
}
