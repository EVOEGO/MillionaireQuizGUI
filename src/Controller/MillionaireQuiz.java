package Controller;

import Models.*;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import static View.gameSoundView.introSound;

public class MillionaireQuiz extends JFrame implements ActionListener {

    private gameSoundView sounds;

    private Card card = new Card();
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        String source = ((Component) actionEvent.getSource()).getName();

        if (source.equals("newGameButton"))
        {
            Game game = new Game(card);
            sounds.stop();

        } else if (source.equals("scoreButton"))
        {
            HighScoreView highScoreView = new HighScoreView(this);
            card.addCardToStack(highScoreView, "highscore");
        }
        else if (source.equalsIgnoreCase("menuButton"))
        {
            card.showCard("Menu");
        }
        else if (source.equals("exitButton"))
        {
            System.exit(0);
        }
    }

    public MillionaireQuiz()
    {
            super("Who wants to be a millionaire");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel menuView = new QuizMenuView(this);
            sounds = new gameSoundView();
            sounds.playGameSound(introSound);

            card.addCardToStack(menuView, "Menu");
            add(card);

            setSize(760, 430);
            setResizable(false);
            setVisible(true);

    }


    public static void main(String[] args) throws IOException, InterruptedException, SQLException
    {

        QuestionDataBase NewQuiz = new QuestionDataBase();
        SetFinalGameQuestions set = new SetFinalGameQuestions();
        QuizDataBase_Connection newConnection = new QuizDataBase_Connection();
        newConnection.establishConnection();
        NewQuiz.queryDataBase();
        NewQuiz.queryHighScoreDataBase();
        set.setFinalQuestions();

           //QuizDataBase_Connection qdb = new QuizDataBase_Connection(); //qdb stands for "Quiz Data Base"
//        Connection connection =null;
//
//        try
//        {
//            connection = QuizDataBase_Connection.establishConnection();
//
//            if(connection != null)
//            {
//                System.out.println("Connection Successful");
//            }
//
//            newConnection.populateHighscores();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        finally {
//            if(connection != null)
//            {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//
//                }
//            }
//        }

       MillionaireQuiz quiz = new MillionaireQuiz();
    }


}

