package View;

import Models.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 5/06/2017.
 */
public class PhoneAFriendView extends JPanel
{
    private SetFinalGameQuestions QuizQuestions = new SetFinalGameQuestions();
    private ShuffleAnswers answers = new ShuffleAnswers();
    private QuestionNumber qNumber = new QuestionNumber();
    private LifeLines lifeLines = new LifeLines();
    private PhoneAFriend phoneAFriend = new PhoneAFriend();

    private JLabel PhoneAFriendView;
    private JLabel phoneAFriendLabel;
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

    private JTextArea phoneAFriendText;

    Font font = new Font("Dialog", Font.BOLD, 10);

    public PhoneAFriendView(ActionListener w, String username)
    {
        setLayout(null);

        this.phoneAFriendText = new JTextArea(phoneAFriend.getPhoneResponse(username, qNumber.getQuestionNumber()));
        phoneAFriendText.setFont(font);
        phoneAFriendText.setLineWrap(true);
        phoneAFriendText.setWrapStyleWord(true);
        phoneAFriendText.setEditable(false);
        phoneAFriendText.setOpaque(false);
        phoneAFriendText.setForeground(Color.white);
        phoneAFriendText.setBounds(183, 101, 383, 76);
        add(phoneAFriendText);

        this.questionLabel = new JLabel(QuizQuestions.getQuestion(qNumber.getQuestionNumber()).getQuestion());
        questionLabel.setBounds(115, 190, 526, 66);
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

        this.answerButton3 = new JButton("D:   " + answers.getShuffledAnswers().get(1));
        answerButton3.setOpaque(false);
        answerButton3.setContentAreaFilled(false);
        answerButton3.setBorderPainted(false);
        answerButton3.setBounds(450, 344, 245, 25);
        answerButton3.setForeground(Color.white);
        answerButton3.setName(answers.getShuffledAnswers().get(1));
        answerButton3.addActionListener(w);
        add(answerButton3);

        this.answerButton2 = new JButton("B:   " + answers.getShuffledAnswers().get(2));
        answerButton2.setOpaque(false);
        answerButton2.setContentAreaFilled(false);
        answerButton2.setBorderPainted(false);
        answerButton2.setBounds(450, 285, 245, 25);
        answerButton2.setForeground(Color.white);
        answerButton2.setName(answers.getShuffledAnswers().get(2));
        answerButton2.addActionListener(w);
        add(answerButton2);

        this.answerButton1 = new JButton("A:   " + answers.getShuffledAnswers().get(3));
        answerButton1.setOpaque(false);
        answerButton1.setContentAreaFilled(false);
        answerButton1.setBorderPainted(false);
        answerButton1.setBounds(60, 285, 245, 25);
        answerButton1.setForeground(Color.white);
        answerButton1.setName(answers.getShuffledAnswers().get(3));
        answerButton1.addActionListener(w);
        add(answerButton1);

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
            fiftyFiftyButton.setBounds(498, 25, 65, 31);
            fiftyFiftyButton.setName("fiftyFiftyButton");
            fiftyFiftyButton.addActionListener(w);
            add(fiftyFiftyButton);
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

        this.PhoneAFriendView = new JLabel();
        PhoneAFriendView.setIcon(new ImageIcon("img\\PhoneAFriend.jpg"));
        PhoneAFriendView.setBounds(0, 0, 760,400);
        add(PhoneAFriendView);
    }
}
