package drumMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.event.KeyEvent;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("JDrum");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 665, 750));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("s");
        }

        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("s");
        }

        if (key == KeyEvent.VK_UP) {
            System.out.println("s");
        }

        if (key == KeyEvent.VK_DOWN) {
            System.out.println("s");
        }
    }

}
