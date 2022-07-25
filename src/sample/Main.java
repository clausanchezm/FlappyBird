package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //atm i cant really add an instance to the stage
        Bird bird = new Bird(Constants.SIZE_X, Constants.SIZE_Y);
        Group group = new Group();
        Scene scene = new Scene(group, 600, 500);
        Stage stage = new Stage();
//        Ellipse ellipse = new Ellipse(200, 200, 300, 300);
        group.getChildren().add(bird);
        bird.setTranslateY(bird.update());
        stage.setScene(scene);
        stage.show();
        bird.playTrans();
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}
