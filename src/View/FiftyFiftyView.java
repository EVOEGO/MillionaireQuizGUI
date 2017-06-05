package View;

import Models.LifeLines;
import Models.QuestionNumber;
import Models.SetFinalGameQuestions;
import Models.ShuffleAnswers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 4/06/2017.
 */
public class FiftyFiftyView extends JPanel
{
    public SetFinalGameQuestions QuizQuestions = new SetFinalGameQuestions();
    public ShuffleAnswers answers = new ShuffleAnswers();
    public QuestionNumber qNumber = new QuestionNumber();
    private LifeLines lifeLines = new LifeLines();

    private JButton answerButton1;
    private JButton answerButton2;
    private JButton exitButton;
    private JButton fiftyFiftyButton;

    private JLabel questionLabel;
    private JLabel fiftyFiftyBackground;
    private JLabel redx1;
    private JLabel redx2;
    private JLabel redx3;


    public FiftyFiftyView(ActionListener w)
    {
        setLayout(null);

        this.questionLabel = new JLabel(QuizQuestions.getQuestion(qNumber.getQuestionNumber()).getQuestion());
        questionLabel.setBounds(115, 190, 526, 66);
        questionLabel.setForeground(Color.white);
        add(questionLabel);

        this.answerButton1 = new JButton(answers.getFiftyFifty().get(0));
        answerButton1.setOpaque(false);
        answerButton1.setContentAreaFilled(false);
        answerButton1.setBorderPainted(false);
        answerButton1.setBounds(60, 285, 245, 25);
        answerButton1.setForeground(Color.white);
        answerButton1.setName(answers.getFiftyFifty().get(0));
        answerButton1.addActionListener(w);
        add(answerButton1);

        this.answerButton2 = new JButton(answers.getFiftyFifty().get(1));
        answerButton2.setOpaque(false);
        answerButton2.setContentAreaFilled(false);
        answerButton2.setBorderPainted(false);
        answerButton2.setBounds(450, 285, 245, 25);
        answerButton2.setForeground(Color.white);
        answerButton2.setName(answers.getFiftyFifty().get(1));
        answerButton2.addActionListener(w);
        add(answerButton2);

        this.exitButton = new JButton();
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBounds(8, 10, 70, 25);
        exitButton.setName("exitButton");
        exitButton.addActionListener(w);
        add(exitButton);

        this.fiftyFiftyBackground = new JLabel();
        fiftyFiftyBackground.setIcon(new ImageIcon("img\\fifty fifty.jpg"));
        fiftyFiftyBackground.setBounds(0, 0, 760, 400);
        add(fiftyFiftyBackground);


        if(lifeLines.getLifeLines(0) == true)
        {
            this.redx1 = new JLabel("New label");
            redx1.setIcon(new ImageIcon("img\\red x fianl 1.png"));
            redx1.setBounds(477, 0, 97, 73);
            add(redx1);
        }
        if(lifeLines.getLifeLines(1) == true)
        {
            this.redx2 = new JLabel("New label");
            redx2.setIcon(new ImageIcon("img\\red x fianl 1.png"));
            redx2.setBounds(566, 3, 105, 66);
            add(redx2);

        }
        if(lifeLines.getLifeLines(2) == true)
        {
            this.redx3 = new JLabel("New label");
            redx3.setIcon(new ImageIcon("img\\red x fianl 1.png"));
            redx3.setBounds(661, 0, 110, 73);
            add(redx3);
        }

    }
}
