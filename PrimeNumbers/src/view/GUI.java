package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame {

	private JTextArea textArea;
	private JLabel label;
	private JLabel label2;
	private JPanel panel;

	public GUI() {

		label2 = new JLabel();
		label2.setText("Prime Numbers from 0-1000");
		textArea = new JTextArea(20, 40);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.WHITE);
		label = new JLabel();
		panel = new JPanel();
		panel.add(label2);
		panel.add(textArea);
		panel.add(label);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 420);
		setVisible(true);
	}
// This method displays the prime numbers in the text area of the GUI.

	public void displayPrimeNumbers(String primes) {
		textArea.setText(primes);
	}

// This method displays the amount of prime numbers in the label of the GUI
	public void displayPrimeAmount(int primeCount) {
		label.setText("Amount of prime numbers: " + primeCount);

	}

}
