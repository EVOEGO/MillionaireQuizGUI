package View;

import Models.QuestionDataBase;
import Models.QuestionNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 6/06/2017.
 */
public class HighScoreView extends JPanel
{
    QuestionDataBase questionDataBase = new QuestionDataBase();
    QuestionNumber qNumber = new QuestionNumber();

    private JButton firstButton;
    private JButton secondButton;
    private JButton thirdButton;
    private JButton fourthButton;
    private JButton fifthButton;
    private JButton sixthButton;
    private JButton seventhButton;
    private JButton eighthButton;
    private JButton ninthButton;
    private JButton tenthButton;
    private JButton menu;

    private JLabel scoreBackground;

    public HighScoreView(ActionListener w)
    {
        setLayout(null);

        this.menu = new JButton("Menu");
        menu.setName("menuButton");
        menu.setOpaque(false);
        menu.setContentAreaFilled(false);
        menu.setBorderPainted(false);
        menu.setForeground(Color.white);
        menu.setBounds(340, 254, 76, 31);
        menu.addActionListener(w);
        add(menu);

        this.firstButton = new JButton(questionDataBase.getSCORES().get(0).getUsername() + " :" + questionDataBase.getSCORES().get(0).getWinnings());
        firstButton.setBounds(74, 108, 218, 31);
        firstButton.setOpaque(false);
        firstButton.setContentAreaFilled(false);
        firstButton.setBorderPainted(false);
        firstButton.setForeground(Color.white);
        add(firstButton);

        this.secondButton = new JButton(questionDataBase.getSCORES().get(1).getUsername() + " :" + questionDataBase.getSCORES().get(1).getWinnings());
        secondButton.setBounds(75, 165, 218, 31);
        secondButton.setOpaque(false);
        secondButton.setContentAreaFilled(false);
        secondButton.setBorderPainted(false);
        secondButton.setForeground(Color.white);
        add(secondButton);

        this.thirdButton = new JButton(questionDataBase.getSCORES().get(2).getUsername() + " :" + questionDataBase.getSCORES().get(2).getWinnings());
        thirdButton.setBounds(75, 223, 218, 31);
        thirdButton.setOpaque(false);
        thirdButton.setContentAreaFilled(false);
        thirdButton.setBorderPainted(false);
        thirdButton.setForeground(Color.white);
        add(thirdButton);

        this.fourthButton = new JButton(questionDataBase.getSCORES().get(3).getUsername() + " :" + questionDataBase.getSCORES().get(3).getWinnings());
        fourthButton.setBounds(76, 281, 218, 31);
        fourthButton.setOpaque(false);
        fourthButton.setContentAreaFilled(false);
        fourthButton.setBorderPainted(false);
        fourthButton.setForeground(Color.white);
        add(fourthButton);

        this.fifthButton = new JButton(questionDataBase.getSCORES().get(4).getUsername() + " :" + questionDataBase.getSCORES().get(4).getWinnings());
        fifthButton.setBounds(73, 339, 218, 31);
        fifthButton.setOpaque(false);
        fifthButton.setContentAreaFilled(false);
        fifthButton.setBorderPainted(false);
        fifthButton.setForeground(Color.white);
        add(fifthButton);

        this.sixthButton = new JButton(questionDataBase.getSCORES().get(5).getUsername() + " :" + questionDataBase.getSCORES().get(5).getWinnings());
        sixthButton.setBounds(465, 108, 218, 31);
        sixthButton.setOpaque(false);
        sixthButton.setContentAreaFilled(false);
        sixthButton.setBorderPainted(false);
        sixthButton.setForeground(Color.white);
        add(sixthButton);

        this.seventhButton = new JButton(questionDataBase.getSCORES().get(6).getUsername() + " :" + questionDataBase.getSCORES().get(6).getWinnings());
        seventhButton.setBounds(465, 165, 218, 31);
        seventhButton.setOpaque(false);
        seventhButton.setContentAreaFilled(false);
        seventhButton.setBorderPainted(false);
        seventhButton.setForeground(Color.white);
        add(seventhButton);

        this.eighthButton = new JButton(questionDataBase.getSCORES().get(7).getUsername() + " :" + questionDataBase.getSCORES().get(7).getWinnings());
        eighthButton.setBounds(465, 223, 218, 31);
        eighthButton.setOpaque(false);
        eighthButton.setContentAreaFilled(false);
        eighthButton.setBorderPainted(false);
        eighthButton.setForeground(Color.white);
        add(eighthButton);

        this.ninthButton = new JButton(questionDataBase.getSCORES().get(8).getUsername() + " :" + questionDataBase.getSCORES().get(8).getWinnings());
        ninthButton.setBounds(465, 281, 218, 31);
        ninthButton.setOpaque(false);
        ninthButton.setContentAreaFilled(false);
        ninthButton.setBorderPainted(false);
        ninthButton.setForeground(Color.white);
        add(ninthButton);

        this.tenthButton = new JButton(questionDataBase.getSCORES().get(9).getUsername() + " :" + questionDataBase.getSCORES().get(9).getWinnings());
        tenthButton.setBounds(465, 339, 218, 31);
        tenthButton.setOpaque(false);
        tenthButton.setContentAreaFilled(false);
        tenthButton.setBorderPainted(false);
        tenthButton.setForeground(Color.white);
        add(tenthButton);

        this.scoreBackground = new JLabel();
        scoreBackground.setBackground(new Color(240, 240, 240));
        scoreBackground.setIcon(new ImageIcon("img\\HighscoresScreen.jpg"));
        scoreBackground.setBounds(0, 0, 760, 400);
        add(scoreBackground);
    }
}

