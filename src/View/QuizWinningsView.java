package View;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class QuizWinningsView extends JPanel
{

    public QuizWinningsView()
    {
        setLayout(null);

        JLabel winningsBackground = new JLabel("");
        winningsBackground.setIcon(new ImageIcon("img\\Who-Wants-To-Be-A-Millionaire.jpeg"));
        add(winningsBackground);

    }

}
