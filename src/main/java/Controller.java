import com.google.common.base.Charsets;
import com.google.common.io.Files;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Controller {
    @FXML
    TextField in;

    @FXML
    TextField out;

    @FXML
    Button start;


    @FXML
    Stage stage;


    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("down.png"),
                128, 128, true, true);
        start.setGraphic(new ImageView(image));

    }


    public void loadWords(File file) {
        try {
            String result = Files.toString(file, Charsets.UTF_8);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void openFromFile() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Otwórz plik...");
        File f = chooser.showOpenDialog(stage);
        if (f!=null) loadWords(f);
    }
}
