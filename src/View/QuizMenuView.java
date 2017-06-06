package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class QuizMenuView extends JPanel
{
	private JButton exitButton;
	private JButton scoreButton;
	private JButton new_Game_Button;
	private JButton rulesButton;

	public QuizMenuView(ActionListener e)
	{
		setLayout(null);
		
		this.exitButton = new JButton();
		exitButton.setName("exitButton");
		exitButton.setOpaque(false);
		exitButton.addActionListener(e);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setBounds(497, 301, 140, 23);
		add(exitButton);
		
		this.scoreButton = new JButton();
		scoreButton.setName("scoreButton");
		scoreButton.setOpaque(false);
		scoreButton.addActionListener(e);
		scoreButton.setContentAreaFilled(false);
		scoreButton.setBorderPainted(false);
		scoreButton.setBounds(110, 301, 140, 23);
		add(scoreButton);
		
		this.new_Game_Button = new JButton();
		new_Game_Button.setName("newGameButton");
		new_Game_Button.setBounds(300, 301, 140, 23);
		new_Game_Button.setOpaque(false);
		new_Game_Button.addActionListener(e);
		new_Game_Button.setContentAreaFilled(false);
		new_Game_Button.setBorderPainted(false);
		add(new_Game_Button);

		this.rulesButton = new JButton();
		rulesButton.setOpaque(false);
		rulesButton.setContentAreaFilled(false);
		rulesButton.setBorderPainted(false);
		rulesButton.setName("rulesButton");
		rulesButton.addActionListener(e);
		rulesButton.setBounds(566, 33, 151, 34);
		add(rulesButton);

		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon("img\\main menu altered.jpg"));
		background.setBounds(0, 0, 760, 400);
		add(background);
	}
}
