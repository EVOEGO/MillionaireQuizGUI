package Models;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by izaac on 5/06/2017.
 */
public class PhoneAFriend
{
   private SetFinalGameQuestions QuizQuestions = new SetFinalGameQuestions();
   private ShuffleAnswers answers = new ShuffleAnswers();
   private ArrayList<String> friendNames = new ArrayList<String>();


    public Integer friendIsCorrect() {
        int randomNumber = 0;
        Random rand = new Random();

        randomNumber = rand.nextInt((100 - 1) + 1) + 1;


        return randomNumber;
    }

    public Integer randomNumber() {
        int number = 0;
        Random rand = new Random();

        number = rand.nextInt((4 - 1) + 1) + 1;

        return number;
    }

    public String getPhoneResponse(String name, int round) {
        //phone a friend
        int friendIsIncorrect = 40;
        int i = round;
        String username = name;
        String friendAnswer = "";



        if (friendIsCorrect() > friendIsIncorrect) {
            for (int y = 0; y < answers.getShuffledAnswers().size(); y++) {
                if (QuizQuestions.getQuestion(i).getAnswer().equalsIgnoreCase(answers.getShuffledAnswers().get(y))) {
                    friendAnswer = friendAnswer.concat("Hello " + username + " its your mate " + friendNames.get(getFriendName()) + " here, i looked at the question" + "\n");
                    friendAnswer = friendAnswer.concat("and i believe that | " + answers.getShuffledAnswers().get(y) + " | is the correct one. ");
                    friendAnswer = friendAnswer.concat("GoodLuck!!! Catch You Later.");

                    return friendAnswer;
                }
            }
        } else {
            friendAnswer = friendAnswer.concat("Sup man " + username + " its your friend " + friendNames.get(getFriendName()) + "here, i looked at the question" + "\n");
            friendAnswer = friendAnswer.concat("your stuck on, and i think the answer is | " + answers.getShuffledAnswers().get(randomNumber()) + " | hope that helps! later man!");

            return friendAnswer;

        }

        return friendAnswer;
    }

    public Integer getFriendName() {
        int number = 0;
        Random rand = new Random();

        friendNames.add("Joe");
        friendNames.add("Mike");
        friendNames.add("Jarad");
        friendNames.add("Tj");
        friendNames.add("Isabella");
        friendNames.add("Tina");
        friendNames.add("Grace");
        friendNames.trimToSize();

        number = rand.nextInt((6 - 1) + 1) + 1;

        return number;
    }

}
