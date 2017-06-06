package Models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by izaac on 30/03/2017.
 * This class handles all the processes in storing and reading in the games highscores
 */
public class HighScores {
    private QuestionDataBase questionDataBase =new QuestionDataBase();
    private ScoreAttributes scoreAttributes = new ScoreAttributes();

    /*saveHighScore method will write to the highscores file. So that i can keep a running count
    * of the current highscores.*/

    public void setNewHighScores(String username, int winnings)
    {
        scoreAttributes.setUsername(username);
        scoreAttributes.setWinnings(winnings);
        questionDataBase.getSCORES().add(scoreAttributes);
        //HighScores.remove(HighScores.get(10));
        Collections.sort(questionDataBase.getSCORES());

    }

}
