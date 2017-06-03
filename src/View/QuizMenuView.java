package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class QuizMenuView extends JPanel
{
//	private JButton new_Game_Button;
//	private JButton exitButton;
//	private JButton scoreButton;
//	private JLabel background;
//
//	public JButton getGameButton()
//	{
//		return this.new_Game_Button;
//	}
//
//	public JButton getExitButton()
//	{
//		return this.exitButton;
//	}
//
//	public JButton getScoreButton()
//	{
//		return this.scoreButton;
//	}
	
	public QuizMenuView(ActionListener e)
	{
		setLayout(null);
		
		JButton exitButton = new JButton();
		exitButton.setName("exitButton");
		exitButton.setOpaque(false);
		exitButton.addActionListener(e);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setBounds(497, 301, 140, 23);
		add(exitButton);
		
		JButton scoreButton = new JButton();
		scoreButton.setName("scoreButton");
		scoreButton.setOpaque(false);
		scoreButton.addActionListener(e);
		scoreButton.setContentAreaFilled(false);
		scoreButton.setBorderPainted(false);
		scoreButton.setBounds(110, 301, 140, 23);
		add(scoreButton);
		
		JButton new_Game_Button = new JButton();
		new_Game_Button.setName("newGameButton");
		new_Game_Button.setBounds(300, 301, 140, 23);
		new_Game_Button.setOpaque(false);
		new_Game_Button.addActionListener(e);
		new_Game_Button.setContentAreaFilled(false); 
		new_Game_Button.setBorderPainted(false); 
		add(new_Game_Button);

		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon("C:\\Users\\izaac\\Downloads\\main menu.png"));
		background.setBounds(0, 0, 760, 400);
		add(background);
	}
}
