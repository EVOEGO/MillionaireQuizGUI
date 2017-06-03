package Models;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by izaac on 17/05/2017.
 */
public class QuestionDataBase
{
    private static ArrayList<Attributes> Quiz_Questions = new ArrayList<Attributes>();
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
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
//        finally
//        {
//            if(statement != null)
//            {
//                statement.close();
//            }
//        }
    }

    public ArrayList<Attributes> getQuiz_Questions()
    {
        return this.Quiz_Questions;
    }
}
