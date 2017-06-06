package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 6/06/2017.
 */
public class QuizRulesView extends JPanel
{
    private JButton returnButton;
    private JLabel rulesBackground;

    public QuizRulesView(ActionListener w)
    {
        setLayout(null);

        this.returnButton = new JButton();
        returnButton.setOpaque(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setBorderPainted(false);
        returnButton.setName("returnButton");
        returnButton.addActionListener(w);
        returnButton.setBounds(343, 344, 109, 33);
        add(returnButton);

        this.rulesBackground = new JLabel("New label");
        rulesBackground.setIcon(new ImageIcon("img\\Rules.jpg"));
        rulesBackground.setBounds(15, 0, 763, 400);
        add(rulesBackground);
    }
}
