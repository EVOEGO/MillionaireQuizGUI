package Controller;

import Models.QuestionDataBase;
import Models.QuestionNumber;
import Models.SetFinalGameQuestions;
import Models.ShuffleAnswers;
import View.Card;
import View.QuizCorrectView;
import View.QuizIncorrectView;
import View.QuizQuestionView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by izaac on 22/05/2017.
 */
public class Game implements ActionListener
{
    private QuestionDataBase CompleteQuizQuestions = new QuestionDataBase();
    private SetFinalGameQuestions QuizQuestions = new SetFinalGameQuestions();
    private ShuffleAnswers SortedAnswers = new ShuffleAnswers();
    private QuestionNumber question = new QuestionNumber();
    private String source;
    private Card card;
    private int question_Number;

    public ArrayList<String> getRoundAnswers()
    {
        return SortedAnswers.getShuffledAnswers();
    }


    public Game(Card card){
        this.card = card;

        QuizQuestionView FirstQuestionView = new QuizQuestionView(this);
        card.addCardToStack(FirstQuestionView, QuizQuestions.getQuestion(question.getQuestionNumber()).getUUID());
        QuizCorrectView correctView = new QuizCorrectView(this);
        QuizIncorrectView incorrectView = new QuizIncorrectView(this);
        card.addCardToStack(correctView, "Correct");
        card.addCardToStack(incorrectView, "Incorrect");

    }


    public void actionPerformed(ActionEvent actionEvent)
    {

            source = ((Component) actionEvent.getSource()).getName();


            if (source.equalsIgnoreCase(QuizQuestions.getQuestion(question.getQuestionNumber()).getAnswer()))
            {
                question_Number++;
                question.setCurrentNumber(question_Number);

                QuizQuestionView NextQuestionView = new QuizQuestionView(this);

                card.addCardToStack(NextQuestionView, QuizQuestions.getQuestion(question.getQuestionNumber()).getUUID());
            } else if (source.equalsIgnoreCase("nextQuestionButton")) {
                card.showCard("nextQuestionButton");
            } else if (source.equalsIgnoreCase("returnToMenuBTN")) {
                card.showCard("Menu");
            } else {
                card.showCard("Menu");
            }
    }

}








