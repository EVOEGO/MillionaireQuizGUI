package View;

import Models.PrizeMoney;
import Models.QuestionNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class QuizIncorrectView extends JPanel
{
    PrizeMoney score = new PrizeMoney();
    QuestionNumber qNumber = new QuestionNumber();

    private JButton returnToMenuBTN;
    private JButton winnings;

    Font font = new Font("Serif", Font.BOLD, 20);

    public JButton getReturnButton()
    {
        return this.returnToMenuBTN;
    }


    public QuizIncorrectView(ActionListener w)
    {
        setLayout(null);

        this.returnToMenuBTN = new JButton();
        returnToMenuBTN.setOpaque(false);
        returnToMenuBTN.setContentAreaFilled(false);
        returnToMenuBTN.setBorderPainted(false);
        returnToMenuBTN.setBounds(595, 300, 155, 85);
        returnToMenuBTN.setName("returnToMenuBTN");
        returnToMenuBTN.addActionListener(w);
        add(returnToMenuBTN);

        this.winnings = new JButton("You Lost: $" + score.getPrizeMoney(qNumber.getQuestionNumber()));
        winnings.setFont(font);
        winnings.setOpaque(false);
        winnings.setContentAreaFilled(false);
        winnings.setBorderPainted(false);
        winnings.setForeground(Color.white);
        winnings.setBounds(218, 273, 327, 45);
        add(winnings);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("img\\incorrect fixed.jpg"));
        lblNewLabel.setBounds(0, 0, 760, 400);
        add(lblNewLabel);
    }
}
