package Tests;

import static org.junit.Assert.*;

import Models.*;
import org.junit.Test;


/**
 * Created by izaac on 6/06/2017.
 */
public class TestGame
{
    @Test
    public void testQuestionNumber()
    {
        QuestionNumber qNumber = new QuestionNumber();
        qNumber.setCurrentNumber(10);
        int output = qNumber.getQuestionNumber();

        assertEquals(10, output);


    }

//    @Test
//    public void testAskTheAudience()
//    {
//        AskTheAudience askTheAudience = new AskTheAudience();
//        askTheAudience.setAskTheAudience(3);
//        int output = askTheAudience.getChancePercentage(1);
//
//        assertEquals(10, output);
//
//    }


    @Test
    public void testLifeLines()
    {
        LifeLines lifeLines = new LifeLines();
        lifeLines.setLifeLines();
        boolean output = lifeLines.getLifeLines(1);

        assertEquals(false, output);
    }

    @Test
    public void testUsedLifeLine()
    {
        LifeLines lifeLines = new LifeLines();
        lifeLines.setLifeLines();
        lifeLines.usedLifeLine(1);
        boolean output = lifeLines.getLifeLines(1);

        assertEquals(true, output);
    }

    @Test
    public void testUserInput()
    {
        Username username = new Username();
        username.setUserInput(false);
        boolean output = username.getUserInput();

        assertEquals(false, output);
    }

    @Test
    public void testPrizeMoney()
    {
        PrizeMoney prizeMoney = new PrizeMoney();
        int output = prizeMoney.getPrizeMoney(14);

        assertEquals(1000000, output);

    }

}
