import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ControlToo extends Application {
    public Button sixth;
    public Button fifth;
    public Button fourth;
    public Button third;
    public Button second;
    public Button first;
    public Button seventh;
    public Button exitButton;
    public Button minimizeButton;
    public Text one;
    public Text two;
    public Text three;
    public Text four;
    public Text five;
    public Text six;
    public Text seven;
    public Text eight;
    public Button eighth;
    public Button Start;
    public Button piano;
    public Button gourd;

    @Override
    public void start(Stage primaryStage) {
        Start.setStyle("-fx-underline: true");
        eighth.setVisible(false);
    }

    //a = 1; s = 2; d = 3; j = 4, k= 5; l = 6; ;= 7 ; SPACE = none


    public void pressC() {
        Start.setStyle("-fx-underline: true");
        Start.setOnKeyPressed(event1 -> {
                    //low
                    if (event1.getCode() == KeyCode.A) {
                        first.fire();
                    }
                    else if (event1.getCode() == KeyCode.S) {
                        second.fire();
                    }
                    else if (event1.getCode() == KeyCode.D) {
                        third.fire();
                    }
                    else if (event1.getCode() == KeyCode.F) {
                        fourth.fire();
                    }
                    else if (event1.getCode() == KeyCode.J) {
                        fifth.fire();
                    }
                    else if (event1.getCode() == KeyCode.K) {
                        sixth.fire();
                    }
                    else if (event1.getCode() == KeyCode.L) {
                        seventh.fire();
                    }

                    //none
                    else if (event1.getCode() == KeyCode.SPACE) {
                        eighth.fire();
                    }
                });
    }

    //play notes

    public void playC() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        one.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        one.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        first.getStyleClass().add("button6");
        second.getStyleClass().add("button6");
        third.getStyleClass().add("button6");
        fourth.getStyleClass().add("button6");
        fifth.getStyleClass().add("button6");
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/C.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        two.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        two.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        second.getStyleClass().add("button6");
        third.getStyleClass().add("button6");
        fourth.getStyleClass().add("button6");
        fifth.getStyleClass().add("button6");
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/D.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playE() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        three.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        three.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        third.getStyleClass().add("button6");
        fourth.getStyleClass().add("button6");
        fifth.getStyleClass().add("button6");
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/E.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playF() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        four.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        four.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        fourth.getStyleClass().add("button6");
        fifth.getStyleClass().add("button6");
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/F.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playG() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        five.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        five.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        fifth.getStyleClass().add("button6");
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/G.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playA() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        six.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        six.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        sixth.getStyleClass().add("button6");
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/A.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playB() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        seven.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        seven.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        seventh.getStyleClass().add("button5");
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/B.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }

    public void playCh() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset2();
        //drop shadow and style current note
        eight.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        eight.setFill(Paint.valueOf("#0a5a62"));

        //reset all buttons
        reset();
        //play note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotesGourd/CH.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        
        clip.start();
    }





    //reset
    public void reset2(){
        //reset all of the notes
        one.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        one.setFill(Paint.valueOf("#000000"));
        two.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        two.setFill(Paint.valueOf("#000000"));
        three.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        three.setFill(Paint.valueOf("#000000"));
        four.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        four.setFill(Paint.valueOf("#000000"));
        five.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        five.setFill(Paint.valueOf("#000000"));
        six.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        six.setFill(Paint.valueOf("#000000"));
        seven.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        seven.setFill(Paint.valueOf("#000000"));
        eight.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203, 0), 10, 0.5, 0.0, 0.0);");
        eight.setFill(Paint.valueOf("#000000"));
    }


    public void reset(){
    first.getStyleClass().remove("button6");
    second.getStyleClass().remove("button6");
    third.getStyleClass().remove("button6");
    fourth.getStyleClass().remove("button6");
    fifth.getStyleClass().remove("button6");
    sixth.getStyleClass().remove("button6");
    seventh.getStyleClass().remove("button5");
    }


    //exiting and minimizing field
    public void exitProgram() {
        Platform.exit();
    } //exit program

    public void minimizeProgram() { //minimize window
        Stage obj = (Stage) minimizeButton.getScene().getWindow(); //collapsing window
        obj.setIconified(true); //to icon
    }


    public void moveToPiano(ActionEvent event) throws Exception {
        Stage stage;//set stage
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/ucf/assignment/Piano.fxml"))); //access the file needed to load FXML; this will be the source of the code
        Scene scene = new Scene(root); // attach scene graph to scene
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Treble"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        scene.getStylesheets().add("ucf/assignment/Style/piano.css"); //stylesheet on hand
        stage.show(); // display the stage

    }
}
