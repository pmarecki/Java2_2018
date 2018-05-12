import com.google.common.base.Charsets;
import com.google.common.io.Files;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.YouTubeVideo;

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

    @FXML
    ComboBox kombo;


    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("down.png"),
                128, 128, true, true);
        start.setGraphic(new ImageView(image));

        ObservableList<YouTubeVideo> listaFilmikow =
                FXCollections.observableArrayList();
        listaFilmikow.add(new YouTubeVideo("a","a","a","a"));
        listaFilmikow.add(new YouTubeVideo("b","a","a","a"));
        listaFilmikow.add(new YouTubeVideo("c","a","a","a"));

        kombo.setItems(listaFilmikow);
        selectFirstInKombo();
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

    public void addVideo() {
        YouTubeVideo nowe = new YouTubeVideo(in.getText(),
                out.getText(), "...", "....");
        kombo.getItems().add(nowe);
        selectLastInCombo();
    }


    private void selectFirstInKombo() {
        kombo.getSelectionModel().select(0);
    }

    private void selectLastInCombo() {
        int n = kombo.getItems().size();
        kombo.getSelectionModel().select(n-1);
    }
}
