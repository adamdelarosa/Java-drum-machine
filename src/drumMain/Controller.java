package drumMain;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;

public class Controller {

    public void padOne(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Server/Sound/switch.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
