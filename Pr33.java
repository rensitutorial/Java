import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;

public class Pr33 extends Application {

    public void start(Stage stage) {
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            Color color = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    0.3 + (random.nextDouble() * 0.7));

            text.setFill(color);

            root.getChildren().add(text);
        }

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Random Text Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
