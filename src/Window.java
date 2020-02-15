import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Window {
	
	JFrame window = new JFrame("Way2Go");
	Color backgroundColor = new Color(35, 0, 0);
	Container con;
	
	public Window() {
		
	}
	
	
	public void createWindow() {
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(backgroundColor);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		con = window.getContentPane();
	}
	
}