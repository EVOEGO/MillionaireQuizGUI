package Models;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by izaac on 18/05/2017.
 */
public class ShuffleAnswers
{
    private SetFinalGameQuestions questions = new SetFinalGameQuestions();
    private QuestionNumber qNumber = new QuestionNumber();
    private static ArrayList<String> ShuffledAnswers = new ArrayList<String>();

    public ArrayList<String> shuffle() {


        questions.getFinalQuizQuestions();
        ShuffledAnswers = new ArrayList<String>();

        ShuffledAnswers.add(questions.getQuestion(qNumber.getQuestionNumber()).getAnswer());
        ShuffledAnswers.add(questions.getQuestion(qNumber.getQuestionNumber()).getIncorrect1());
        ShuffledAnswers.add(questions.getQuestion(qNumber.getQuestionNumber()).getIncorrect2());
        ShuffledAnswers.add(questions.getQuestion(qNumber.getQuestionNumber()).getIncorrect3());
        Collections.shuffle(ShuffledAnswers);

        return ShuffledAnswers;
    }

    public ArrayList<String> getShuffledAnswers()
    {
        return this.ShuffledAnswers;
    }
}
