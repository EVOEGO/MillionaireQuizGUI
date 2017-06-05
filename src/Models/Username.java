package Models;

import View.UsernameView;

/**
 * Created by izaac on 5/06/2017.
 */
public class Username
{
    private static boolean usernameInput;
    private static String usernameText;

    public void setUserInput(boolean result)
    {
        usernameInput = result;
    }

    public boolean getUserInput()
    {
        return this.usernameInput;
    }

    public void setUsernameText()
    {
        usernameText = this.usernameText;
// return this.usernameView.getUsername().getText().toString();
    }

    public String getUsernameText()
    {
        return this.usernameText;
    }
}
