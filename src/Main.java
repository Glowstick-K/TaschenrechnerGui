import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application{

    private TextField display;
    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setEditable(false);
        display.setPrefWidth(200);
        display.setPrefHeight(50);

        Rechner calculator = new Rechner(display);

        GridPane grid = new GridPane();
        grid.add(display, 0, 0, 4, 1);


        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        int row = 1;
        int col = 0;
        for (String text : buttons) {
            Button button = new Button(text);
            button.setPrefWidth(50);
            button.setPrefHeight(50);
            button.setOnAction(e -> calculator.handleButtonClick(text));
            grid.add(button, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        Scene scene = new Scene(grid, 220, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(label, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/

/*public class Main {
    public static void main(String[] args){
        System.out.println("hallo");
    }

}*/
