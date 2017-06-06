package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by izaac on 17/05/2017.
 */
public class QuestionDataBase
{
    private static ArrayList<Attributes> Quiz_Questions = new ArrayList<Attributes>();
    private static ArrayList<ScoreAttributes> SCORES = new ArrayList<ScoreAttributes>();
   // private HighScores highScores = new HighScores();
    QuizDataBase_Connection connect = new QuizDataBase_Connection();
    Statement statement;
    Connection conn;
    //String dbName = "QUIZ_DATABASE"
;
   public void queryDataBase() {
        statement = null;
        String query = "select *" + "from " + connect.getDataBaseName();
        try
        {
            statement = connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
            {
                Attributes attribute = new Attributes();

                attribute.setUUID(rs.getString("UUID"));
                attribute.setDifficulty(rs.getString("DIFFICULTY"));
                attribute.setQuestion(rs.getString("QUESTION"));
                attribute.setAnswer(rs.getString("ANSWER"));
                attribute.setIncorrect1(rs.getString("INCORRECT1"));
                attribute.setIncorrect2(rs.getString("INCORRECT2"));
                attribute.setIncorrect3(rs.getString("INCORRECT3"));
                Quiz_Questions.add(attribute);
            }
            statement.close();
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void queryHighScoreDataBase()
    {
        statement = null;
        String query = "select *" + "from " + connect.getScoreDatabaseName();

        try
        {
            statement = connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
            {

                ScoreAttributes scoreAttributes = new ScoreAttributes();

                scoreAttributes.setUsername(rs.getString("USERNAME"));
                scoreAttributes.setWinnings(Integer.parseInt(rs.getString("WINNINGS")));
                SCORES.add(scoreAttributes);
            }

            Collections.sort(SCORES);
            //Collections.reverse(SCORES);
            statement.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }




    }

    public ArrayList<ScoreAttributes> getSCORES()
    {
        return this.SCORES;
    }

    public ArrayList<Attributes> getQuiz_Questions()
    {
        return this.Quiz_Questions;
    }
}
