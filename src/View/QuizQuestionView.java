package View;

import Controller.Game;
import Models.QuestionNumber;
import Models.SetFinalGameQuestions;
import Models.ShuffleAnswers;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class QuizQuestionView extends JPanel
{
	//public static QuestionDataBase questionDB = new QuestionDataBase();
	public SetFinalGameQuestions Set_Final_Quiz_Questions = new SetFinalGameQuestions();
	public ShuffleAnswers answers = new ShuffleAnswers();
	public QuestionNumber qNumber = new QuestionNumber();

	private JButton exitButton;
	private JLabel questionBackground;
	private JLabel questionLabel;

	private JButton answerButton4;
	private JButton answerButton3;
	private JButton answerButton2;
	private JButton answerButton1;

	private String button1;
	private String button2;
	private String button3;
	private String button4;

	public void setButton1(String button1)
	{
		this.button1 = button1;
	}

	public void setButton2(String button2) {
		this.button2 = button2;
	}

	public void setButton3(String button3) {
		this.button3 = button3;
	}

	public void setButton4(String button4) {
		this.button4 = button4;
	}

	public String getButton1() {
		return button1;
	}

	public String getButton2() {
		return button2;
	}

	public String getButton3() {
		return button3;
	}

	public String getButton4() {
		return button4;
	}

	public JButton getExitButton()
	{
		return this.exitButton;
	}

	public JButton getAnswerButton1()
	{
		return this.answerButton1;
	}

	public JButton getAnswerButton2()
	{
		return this.answerButton2;
	}

	public JButton getAnswerButton3()
	{
		return this.answerButton3;
	}

	public JButton getAnswerButton4()
	{
		return this.answerButton4;
	}

	public JLabel getQuestionLabel() {
		return questionLabel;
	}

	public QuizQuestionView(ActionListener w) {
		setLayout(null);

		answers.shuffle();

		this.questionLabel = new JLabel(Set_Final_Quiz_Questions.getQuestion(qNumber.getQuestionNumber()).getQuestion());
		questionLabel.setBounds(115, 190, 526, 66);
		questionLabel.setForeground(Color.white);
		add(questionLabel);

		this.answerButton4 = new JButton(answers.getShuffledAnswers().get(0));
		answerButton4.setOpaque(false);
		answerButton4.setContentAreaFilled(false);
		answerButton4.setBorderPainted(false);
		answerButton4.setBounds(60, 344, 245, 25);
		answerButton4.setForeground(Color.white);
		answerButton4.setName(answers.getShuffledAnswers().get(0));
		answerButton4.addActionListener(w);
		add(answerButton4);
		this.button4 = answers.getShuffledAnswers().get(0);

		this.answerButton3 = new JButton(answers.getShuffledAnswers().get(1));
		answerButton3.setOpaque(false);
		answerButton3.setContentAreaFilled(false);
		answerButton3.setBorderPainted(false);
		answerButton3.setBounds(450, 344, 245, 25);
		answerButton3.setForeground(Color.white);
		answerButton3.setName(answers.getShuffledAnswers().get(1));
		answerButton3.addActionListener(w);
		add(answerButton3);
		this.button3 = answers.getShuffledAnswers().get(1);

		this.answerButton2 = new JButton(answers.getShuffledAnswers().get(2));
		answerButton2.setOpaque(false);
		answerButton2.setContentAreaFilled(false);
		answerButton2.setBorderPainted(false);
		answerButton2.setBounds(450, 285, 245, 25);
		answerButton2.setForeground(Color.white);
		answerButton2.setName(answers.getShuffledAnswers().get(2));
		answerButton2.addActionListener(w);
		add(answerButton2);
		this.button2 = answers.getShuffledAnswers().get(2);

		this.answerButton1 = new JButton(answers.getShuffledAnswers().get(3));
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

		questionBackground = new JLabel("New label");
		questionBackground.setIcon(new ImageIcon("C:\\Users\\izaac\\Downloads\\Question screen fixed.jpg"));
		questionBackground.setBounds(0, 0, 760,400);
		questionBackground.setForeground(Color.WHITE);
		add(questionBackground);


	}


}

