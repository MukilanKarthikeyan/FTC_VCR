import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WindowTest extends Application{

    Button tbut;
    public static void main(String[] args){
        launch(args);

    }
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Window");
        tbut = new Button("testing");
        StackPane layout = new StackPane();
        layout.getChildren().add(tbut);

        Scene scene = new Scene(layout, 500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
