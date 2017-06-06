package View;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by izaac on 6/06/2017.
 */
public class gameSoundView
{
    public static final String introSound = "gameSounds//intro.wav";
    public static final String userName = "gameSounds//username.wav";
    public static final String questionSound = "gameSounds//question.wav";
    public static final String correctSound = "gameSounds//correctAnswer.wav";
    public static final String exitSound = "gameSounds//end.wav";
    public static final String incorrectSound = "gameSounds//wrongAnswer.wav";
    public static final String fiftyFiftySound = "gameSounds//50_50.wav";

    private Clip sound;

    public void playGameSound(String soundType)
    {
        AudioInputStream audioInputStream = null;
        try
        {
            audioInputStream = AudioSystem.getAudioInputStream(new File(soundType).getAbsoluteFile());
            sound = AudioSystem.getClip();
            sound.open(audioInputStream);
            sound.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        sound.stop();
    }


}
