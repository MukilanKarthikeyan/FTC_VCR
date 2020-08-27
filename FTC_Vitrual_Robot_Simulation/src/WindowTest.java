

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class WindowTest extends Application{

    private Image field;
    private ImageView fieldView;
    Group mainGroup;
    private HBox mainHorizontal;
    Button tbut;
    public static void main(String[] args){
        launch(args);

    }
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Window");
        //tbut = new Button("testing");
        //StackPane layout = new StackPane();
        //layout.getChildren().add(tbut);

        mainGroup = new Group();
        Scene scene = new Scene(mainGroup); // suggested 700x700

        mainHorizontal = new HBox();
        mainHorizontal.prefWidthProperty().bind(primaryStage.widthProperty());
        mainHorizontal.prefHeightProperty().bind(primaryStage.heightProperty());

        field = new Image(new FileInputStream(System.getProperty("user.dir") + "/Skystone Dark Field 750x750.png"));
        fieldView = new ImageView();
        fieldView.setImage(field);

        mainGroup.getChildren().add(fieldView);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
