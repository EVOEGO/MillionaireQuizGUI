package Models;

import java.util.ArrayList;

/**
 * Created by izaac on 4/06/2017.
 */
public class LifeLines
{
    private static ArrayList<Boolean> LifeLines;

    public void setLifeLines()
    {
        LifeLines = new ArrayList<Boolean>();

        for (int x = 0; x < 3; x++)
        {
            LifeLines.add(false);
        }

    }

    public void usedLifeLine(int index)
    {
        LifeLines.set(index, true);
    }

    public Boolean getLifeLines(int index )
    {
        return this.LifeLines.get(index);
    }
}
