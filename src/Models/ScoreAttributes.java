package Models;

/**
 * Created by izaac on 6/06/2017.
 */
public class ScoreAttributes implements Comparable<ScoreAttributes>
{
    private String username;
    private int winnings;


    public ScoreAttributes(String username, int winnings)
    {
        super();
        this.username = username;
        this.winnings = winnings;
    }

    public ScoreAttributes()
    {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWinnings() {
        return winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }

    public int compareTo(ScoreAttributes compareScores) {

        int compareHighScores = ((ScoreAttributes) compareScores).getWinnings();


        return compareHighScores - this.winnings;

    }

    public Object[] toTableRow()
    {
        return new Object[]
                {
                        this.username,
                        this.winnings
                };
    }

    public String toString()
    {
        return this.username + "\n" + this.winnings + "\n";
    }

}
