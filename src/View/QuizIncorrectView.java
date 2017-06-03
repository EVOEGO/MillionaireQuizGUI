package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class QuizIncorrectView extends JPanel
{
    JButton returnToMenuBTN;

    public JButton getReturnButton()
    {
        return this.returnToMenuBTN;
    }


    public QuizIncorrectView(ActionListener w)
    {
        setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\izaac\\Downloads\\incorrect fixed.jpg"));
        lblNewLabel.setBounds(0, 0, 760, 400);
        add(lblNewLabel);

        this.returnToMenuBTN = new JButton("New button");
        returnToMenuBTN.setOpaque(false);
        returnToMenuBTN.setContentAreaFilled(false);
        returnToMenuBTN.setBorderPainted(false);
        returnToMenuBTN.setBounds(595, 300, 155, 85);
        add(returnToMenuBTN);
    }
}
