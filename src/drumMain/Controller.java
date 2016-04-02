package drumMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.InputStream;

public class Controller extends Application implements KeyListener{

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 665, 750);
        stage.setTitle("JDrum");
        stage.setResizable(false);
        stage.show();
        stage.focusedProperty();
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case UP:
                    padOne();
            }
        });
        stage.setScene(scene);
    }





    public void padOne(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/kick1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padTwo(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/fx1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padThree(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/hh1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padFour(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/hh2.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padFive(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/hh3.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padSix(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/crash1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padSeven(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/ride1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padEight(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/snare1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }public void padNine(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/snare2.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padTen(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/snare3.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padEleven(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/synth1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padTwelve(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/synth2.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padThirteen(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/synth3.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padFourteen(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/synth4.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padFifteen(){
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/tom1.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void padSixteen() {
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("Samples/808/tom2.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }

    }
}
