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
