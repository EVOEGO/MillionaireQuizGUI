package Models;

import javax.management.Attribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by izaac on 15/05/2017.
 */
public class QuizDataBase_Connection
{
    public static final String url = "jdbc:derby:DerbyDatabase;create=true";
    public static final String user = "izaac";
    public static final String pass = "izaac";
    public static Connection connection;
    public static int row_Number = 0;
    public static final String databaseName = "IZAAC.Quiz_DataBase";;


    AttributeDataBase data = new AttributeDataBase();
    highScores score = new highScores();


    public static Connection establishConnection()
    {
        connection = null;
        try
        {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println(url + "     Connected.....");

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        return connection;
    }

    public void populateDataBase()
    {
        try
        {
            Statement statement = connection.createStatement();

            /*String sqlCreate = "create table " +database_table+ " (UUID varchar(255), Difficulty int,"
                    +  "Question varchar(255), Answer varchar(255), Incorrect1 varchar(255), Incorrect2 varchar(255)," +
                    "Incorrect3 varchar(255))";

            statement.executeUpdate(sqlCreate);*/



                for(int x = 0; x < data.getCompleteQuestionList().size(); x++)
                {
                    String insert_data = "insert into "  + databaseName + " values";
                    insert_data = insert_data.concat("('" + data.getCompleteQuestionList().get(x).getUUID() + "',`");
                    insert_data = insert_data + "" + data.getCompleteQuestionList().get(x).getDifficulty() + ", ";
                    insert_data = insert_data.concat(" '" + data.getCompleteQuestionList().get(x).getQuestion() + "', ");
                    insert_data = insert_data.concat(" '" + data.getCompleteQuestionList().get(x).getAnswer() + "', ");
                    insert_data = insert_data.concat(" '" + data.getCompleteQuestionList().get(x).getIncorrect1() + "', ");
                    insert_data = insert_data.concat(" '" + data.getCompleteQuestionList().get(x).getIncorrect2() + "', ");
                    insert_data = insert_data.concat(" '" + data.getCompleteQuestionList().get(x).getIncorrect3() + "')");
                    statement.executeUpdate(insert_data);


                }

            statement.close();


            System.out.println("Table Created ");

        }
        catch (SQLException r)
        {
            r.printStackTrace();
        }
    }

    public void populateHighscores()
    {
       /* try
        {
            Statement statement = connection.createStatement();

            String database_table = "IZAAC.QUIZ_HIGHSCORES";
            String sqlCreate = "create table " +database_table+ " (";

            statement.executeUpdate(sqlCreate);

        }
        catch(SQLException t){
            t.printStackTrace();
        }*/
    }

    public Connection getConnection()
    {
        return this.connection;
    }

    public String getUrl()
    {
        return this.url;
    }

    public String getDataBaseName()
    {
        return this.databaseName;
    }

}
