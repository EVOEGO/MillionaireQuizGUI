package View;

import Models.PrizeMoney;
import Models.QuestionNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 5/06/2017.
 */
public class ExitButtonView extends JPanel
{
    private PrizeMoney prizeMoney = new PrizeMoney();
    private QuestionNumber qNumber = new QuestionNumber();

    private JLabel exitButtonBackground;

    private JTextArea exitMessageText;
    private JTextArea congratsText;

    private JButton mainMenuButton;

    Font buttonFont = new Font("Dialog", Font.BOLD, 15);
    Font textFont = new Font("Dialog", Font.BOLD, 24);
    Font winningsText = new Font("Dialog", Font.BOLD, 25);


    public ExitButtonView(ActionListener w, int roundNumber)
    {
        setLayout(null);

        if(roundNumber == 14)
        {
            this.congratsText = new JTextArea("CONGRATULATIONS YOU ARE A MILLIONAIRE!!!");
            congratsText.setFont(winningsText);
            congratsText.setLineWrap(true);
            congratsText.setWrapStyleWord(true);
            congratsText.setEditable(false);
            congratsText.setOpaque(false);
            congratsText.setForeground(Color.yellow);
            congratsText.setBounds(80, 140, 650, 80);
            add(congratsText);


            this.exitMessageText = new JTextArea("YOU WON!!!!!: $" + prizeMoney.getPrizeMoney(qNumber.getQuestionNumber()));
            exitMessageText.setFont(textFont);
            exitMessageText.setLineWrap(true);
            exitMessageText.setWrapStyleWord(true);
            exitMessageText.setEditable(false);
            exitMessageText.setOpaque(false);
            exitMessageText.setForeground(Color.white);
            exitMessageText.setBounds(206, 209, 343, 34);
            add(exitMessageText);

            this.mainMenuButton = new JButton("HighScores");
            mainMenuButton.setOpaque(false);
            mainMenuButton.setFont(buttonFont);
            mainMenuButton.setContentAreaFilled(false);
            mainMenuButton.setBorderPainted(false);
            mainMenuButton.setForeground(Color.white);
            mainMenuButton.setName("mainMenuButton");
            mainMenuButton.setBounds(318, 273, 119, 30);
            mainMenuButton.addActionListener(w);
            add(mainMenuButton);
        }
        else
        {
            this.exitMessageText = new JTextArea("You Lose: $" + prizeMoney.getPrizeMoney(qNumber.getQuestionNumber()));
            exitMessageText.setFont(textFont);
            exitMessageText.setLineWrap(true);
            exitMessageText.setWrapStyleWord(true);
            exitMessageText.setEditable(false);
            exitMessageText.setOpaque(false);
            exitMessageText.setForeground(Color.white);
            exitMessageText.setBounds(206, 209, 343, 34);
            add(exitMessageText);

            this.mainMenuButton = new JButton("Next");
            mainMenuButton.setOpaque(false);
            mainMenuButton.setFont(buttonFont);
            mainMenuButton.setContentAreaFilled(false);
            mainMenuButton.setBorderPainted(false);
            mainMenuButton.setForeground(Color.white);
            mainMenuButton.setName("mainMenuButton");
            mainMenuButton.setBounds(318, 273, 119, 30);
            mainMenuButton.addActionListener(w);
            add(mainMenuButton);
        }

        this.exitButtonBackground = new JLabel();
        exitButtonBackground.setIcon(new ImageIcon("img\\Username Altered.jpg"));
        exitButtonBackground.setBounds(0, 0, 760, 400);
        add(exitButtonBackground);

    }
}
