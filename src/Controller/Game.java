package Controller;

import Models.*;
import View.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private LifeLines lifeLines = new LifeLines();
    private String source;
    private Card card;
    private int question_Number;


    public ArrayList<String> getRoundAnswers()
    {
        return SortedAnswers.getShuffledAnswers();
    }


    public Game(Card card){
        this.card = card;
        QuizQuestions.setFinalQuestions();
        lifeLines.setLifeLines();

        QuizQuestionView FirstQuestionView = new QuizQuestionView(this);
        card.addCardToStack(FirstQuestionView, QuizQuestions.getQuestion(question.getQuestionNumber()).getUUID());

    }


    public void actionPerformed(ActionEvent actionEvent)
    {

            source = ((Component) actionEvent.getSource()).getName();


            if (source.equalsIgnoreCase(QuizQuestions.getQuestion(question.getQuestionNumber()).getAnswer()))
            {
                question_Number++;
                question.setCurrentNumber(question_Number);

                QuizCorrectView correctView = new QuizCorrectView(this);
                card.addCardToStack(correctView, "Correct");

                card.showCard("Correct");

            }
            else if (source.equalsIgnoreCase("nextQuestionButton")) {

                QuizQuestionView NextQuestionView = new QuizQuestionView(this);
                card.addCardToStack(NextQuestionView, QuizQuestions.getQuestion(question.getQuestionNumber()).getUUID());
            } else if (source.equalsIgnoreCase("returnToMenuBTN")) {
                card.showCard("Menu");
            } else if (source.equalsIgnoreCase("exitButton")) {
                card.showCard("Menu");
            }
            else if(source.equalsIgnoreCase("fiftyFiftyButton") && lifeLines.getLifeLines(0) == false) {
                lifeLines.usedLifeLine(0);
                FiftyFiftyView FiftyFiftyView = new FiftyFiftyView(this);
                card.addCardToStack(FiftyFiftyView, QuizQuestions.getQuestion(question.getQuestionNumber()).getUUID());
            }
            else
            {
                QuizIncorrectView incorrectView = new QuizIncorrectView(this);
                card.addCardToStack(incorrectView, "Incorrect");
            }
    }

}








