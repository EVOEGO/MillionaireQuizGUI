package View;

import Models.LifeLines;
import Models.QuestionNumber;
import Models.SetFinalGameQuestions;
import Models.ShuffleAnswers;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class QuizQuestionView extends JPanel
{
	//public static QuestionDataBase questionDB = new QuestionDataBase();
	private SetFinalGameQuestions QuizQuestions = new SetFinalGameQuestions();
	private ShuffleAnswers answers = new ShuffleAnswers();
	private QuestionNumber qNumber = new QuestionNumber();
	private LifeLines lifeLines = new LifeLines();


	private JLabel questionBackground;

	private JLabel questionLabel;
	private JLabel redx1;
	private JLabel redx2;
	private JLabel redx3;

	private JButton exitButton;
	private JButton answerButton4;
	private JButton answerButton3;
	private JButton answerButton2;
	private JButton answerButton1;
	private JButton fiftyFiftyButton;
	private JButton askTheAudienceButton;
	private JButton phoneAFriendButton;

	private String button1;
	private String button2;
	private String button3;
	private String button4;

	public QuizQuestionView(ActionListener w) {
		setLayout(null);

		answers.shuffle();

		this.questionLabel = new JLabel("<html>" + QuizQuestions.getQuestion(qNumber.getQuestionNumber()).getQuestion() + "</html>");
		questionLabel.setBounds(115, 190, 523, 66);
		questionLabel.setForeground(Color.white);
		add(questionLabel);

		this.answerButton4 = new JButton("C:   " + answers.getShuffledAnswers().get(0));
		answerButton4.setOpaque(false);
		answerButton4.setContentAreaFilled(false);
		answerButton4.setBorderPainted(false);
		answerButton4.setBounds(60, 344, 245, 25);
		answerButton4.setForeground(Color.white);
		answerButton4.setName(answers.getShuffledAnswers().get(0));
		answerButton4.addActionListener(w);
		add(answerButton4);
		this.button4 = answers.getShuffledAnswers().get(0);

		this.answerButton3 = new JButton("D:   " + answers.getShuffledAnswers().get(1));
		answerButton3.setOpaque(false);
		answerButton3.setContentAreaFilled(false);
		answerButton3.setBorderPainted(false);
		answerButton3.setBounds(450, 344, 245, 25);
		answerButton3.setForeground(Color.white);
		answerButton3.setName(answers.getShuffledAnswers().get(1));
		answerButton3.addActionListener(w);
		add(answerButton3);
		this.button3 = answers.getShuffledAnswers().get(1);

		this.answerButton2 = new JButton("B:   " + answers.getShuffledAnswers().get(2));
		answerButton2.setOpaque(false);
		answerButton2.setContentAreaFilled(false);
		answerButton2.setBorderPainted(false);
		answerButton2.setBounds(450, 285, 245, 25);
		answerButton2.setForeground(Color.white);
		answerButton2.setName(answers.getShuffledAnswers().get(2));
		answerButton2.addActionListener(w);
		add(answerButton2);
		this.button2 = answers.getShuffledAnswers().get(2);

		this.answerButton1 = new JButton("A:   " + answers.getShuffledAnswers().get(3));
		answerButton1.setOpaque(false);
		answerButton1.setContentAreaFilled(false);
		answerButton1.setBorderPainted(false);
		answerButton1.setBounds(60, 285, 245, 25);
		answerButton1.setForeground(Color.white);
		answerButton1.setName(answers.getShuffledAnswers().get(3));
		answerButton1.addActionListener(w);
		add(answerButton1);
		this.button1 = answers.getShuffledAnswers().get(3);

		this.exitButton = new JButton();
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setBounds(8, 10, 70, 25);
		exitButton.setName("exitButton");
		exitButton.addActionListener(w);
		add(exitButton);

		if(lifeLines.getLifeLines(0) == false)
		{
			this.fiftyFiftyButton = new JButton();
			fiftyFiftyButton.setOpaque(false);
			fiftyFiftyButton.setContentAreaFilled(false);
			fiftyFiftyButton.setBorderPainted(false);
			fiftyFiftyButton.setBounds(498, 21, 76, 42);
			fiftyFiftyButton.setName("fiftyFiftyButton");
			fiftyFiftyButton.addActionListener(w);
			add(fiftyFiftyButton);
		}

		if(lifeLines.getLifeLines(1) == false)
		{
			this.phoneAFriendButton = new JButton();
			phoneAFriendButton.setOpaque(false);
			phoneAFriendButton.setContentAreaFilled(false);
			phoneAFriendButton.setBorderPainted(false);
			phoneAFriendButton.setBounds(584, 21, 76, 42);
			phoneAFriendButton.setName("phoneAFriendButton");
			phoneAFriendButton.addActionListener(w);
			add(phoneAFriendButton);
		}

		if(lifeLines.getLifeLines(2) == false)
		{
			this.askTheAudienceButton = new JButton();
			askTheAudienceButton.setOpaque(false);
			askTheAudienceButton.setContentAreaFilled(false);
			askTheAudienceButton.setBorderPainted(false);
			askTheAudienceButton.setBounds(673, 22, 76, 42);
			askTheAudienceButton.setName("askTheAudienceButton");
			askTheAudienceButton.addActionListener(w);
			add(askTheAudienceButton);

		}

		if(lifeLines.getLifeLines(0) == true)
		{
			this.redx1 = new JLabel();
			redx1.setIcon(new ImageIcon("img\\red x fianl 1.png"));
			redx1.setBounds(477, 0, 97, 73);
			add(redx1);
		}
		if(lifeLines.getLifeLines(1) == true)
		{
			this.redx2 = new JLabel();
			redx2.setIcon(new ImageIcon("img\\red x fianl 1.png"));
			redx2.setBounds(566, 3, 105, 66);
			add(redx2);

		}
		if(lifeLines.getLifeLines(2) == true)
		{
			this.redx3 = new JLabel();
			redx3.setIcon(new ImageIcon("img\\red x fianl 1.png"));
			redx3.setBounds(661, 0, 110, 73);
			add(redx3);
		}

		questionBackground = new JLabel();
		questionBackground.setIcon(new ImageIcon("img\\Question screen fixed.jpg"));
		questionBackground.setBounds(0, 0, 760,400);
		questionBackground.setForeground(Color.WHITE);
		add(questionBackground);
	}


}

