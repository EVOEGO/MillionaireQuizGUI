package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by izaac on 6/06/2017.
 */
public class QuizCompletedView extends JPanel
{
    private JTextArea congratsText;

    public QuizCompletedView(ActionListener w)
    {
        this.congratsText = new JTextArea();
        congratsText.setColumns(10);
        congratsText.setBounds(163, 140, 435, 59);
        add(congratsText);

    }
}
