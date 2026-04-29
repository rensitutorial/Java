import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Pr35 extends Application {

    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.BOTTOM_CENTER);

        VBox bar1 = createBar("Projects - 20%", 20, Color.RED);
        VBox bar2 = createBar("Quizzes - 10%", 10, Color.BLUE);
        VBox bar3 = createBar("Midterm Exams - 30%", 30, Color.GREEN);
        VBox bar4 = createBar("Final Exam - 40%", 40, Color.ORANGE);

        root.getChildren().addAll(bar1, bar2, bar3, bar4);

        Scene scene = new Scene(root, 700, 400);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int percentage, Color color) {
        Rectangle rect = new Rectangle(60, percentage * 5);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(rect, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
