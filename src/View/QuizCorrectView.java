package View;


import Models.PrizeMoney;
import Models.QuestionNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class QuizCorrectView extends JPanel
{
    PrizeMoney score = new PrizeMoney();
    QuestionNumber qNumber = new QuestionNumber();

    private JButton nextQuestionButton;
    private JButton winnings;

    Font font = new Font("Serif", Font.BOLD, 20);

    public JButton getNextButton()
    {
        return this.nextQuestionButton;
    }

    public QuizCorrectView(ActionListener w)
    {
        setLayout(null);

        this.nextQuestionButton = new JButton();
        nextQuestionButton.setOpaque(false);
        nextQuestionButton.setContentAreaFilled(false);
        nextQuestionButton.setBorderPainted(false);
        nextQuestionButton.setBounds(591, 300, 155, 80);
        nextQuestionButton.setName("nextQuestionButton");
        nextQuestionButton.addActionListener(w);
        add(nextQuestionButton);

        this.winnings = new JButton("Prize Total: $" + score.getPrizeMoney(qNumber.getQuestionNumber()));
        winnings.setFont(font);
        winnings.setOpaque(false);
        winnings.setContentAreaFilled(false);
        winnings.setBorderPainted(false);
        winnings.setForeground(Color.white);
        winnings.setBounds(218, 273, 327, 45);
        add(winnings);


        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\izaac\\Downloads\\correct edited.jpg"));
        lblNewLabel.setBounds(0, 0, 759, 400);
        add(lblNewLabel);
    }

}
