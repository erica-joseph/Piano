import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Control extends Application {

    public Button aLow;
    public Button bLow;
    public Button cLow;
    public Button dLow;
    public Button eLow;
    public Button fLow;
    public Button gLow;
    public Button aMid;
    public Button bMid;
    public Button cMid;
    public Button dMid;
    public Button eMid;
    public Button fMid;
    public Button gMid;
    public Button aHigh;
    public Button aSharp;
    public Button cSharp;
    public Button dSharp;
    public Button fSharp;
    public Button gSharp;
    public Button aSharpH;
    public Button cSharpH;
    public Button dSharpH;
    public Button fSharpH;
    public Button gSharpH;
    public Text one;
    public Text two;
    public Text three;
    public Text four;
    public Text five;
    public Text six;
    public Text seven;
    public Text eight;

    @Override
    public void start(Stage primaryStage) {



    }

    //a is pressed
    public void pressA() {
    aLow.setOnKeyPressed(event1 -> {
        //low
        if (event1.getCode() == KeyCode.Z) {
            aLow.fire();
        }
        if (event1.getCode() == KeyCode.X) {
            bLow.fire();
        }
        if (event1.getCode() == KeyCode.C) {
            cLow.fire();
        }
        if (event1.getCode() == KeyCode.V) {
            dLow.fire();
        }
        if (event1.getCode() == KeyCode.B) {
            eLow.fire();
        }
        if (event1.getCode() == KeyCode.N) {
            fLow.fire();
        }
        if (event1.getCode() == KeyCode.M) {
            gLow.fire();
        }
        //mid
        if (event1.getCode() == KeyCode.A) {
            aMid.fire();
        }
        if (event1.getCode() == KeyCode.S) {
            bMid.fire();
        }
        if (event1.getCode() == KeyCode.D) {
            cMid.fire();
        }
        if (event1.getCode() == KeyCode.F) {
            dMid.fire();
        }
        if (event1.getCode() == KeyCode.J) {
            eMid.fire();
        }
        if (event1.getCode() == KeyCode.K) {
            fMid.fire();
        }
        if (event1.getCode() == KeyCode.L) {
            gMid.fire();
        }
        //high
        if (event1.getCode() == KeyCode.Q) {
            aHigh.fire();
        }

        //sharps
        if (event1.getCode() == KeyCode.W) {
            aSharp.fire();
        }
        if (event1.getCode() == KeyCode.E) {
            cSharp.fire();
        }
        if (event1.getCode() == KeyCode.R) {
            dSharp.fire();
        }
        if (event1.getCode() == KeyCode.T) {
            fSharp.fire();
        }
        if (event1.getCode() == KeyCode.Y) {
            gSharp.fire();
        }
        if (event1.getCode() == KeyCode.U) {
            aSharpH.fire();
        }
        if (event1.getCode() == KeyCode.I) {
            cSharpH.fire();
        }
        if (event1.getCode() == KeyCode.O) {
            dSharpH.fire();
        }
        if (event1.getCode() == KeyCode.P) {
            fSharpH.fire();
        }
        if (event1.getCode() == KeyCode.OPEN_BRACKET) {
            gSharpH.fire();
        }
    });
    }

    //lower
    public void playALow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/a3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playALowSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/a-3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playBLow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/b4Check.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playCLow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        one.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        one.setFill(Paint.valueOf("#0a5a62"));
        
        //initiate music
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/c3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playCLowSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();

        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/c-3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playDLow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        two.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        two.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/d3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playDLowSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/d-3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playELow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        three.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        three.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/e3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playFLow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        four.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        four.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/f3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playFLowSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/f-3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playGLow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        five.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        five.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/g3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playGLowSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/g-3.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    //mid
    public void playAMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        six.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        six.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/a4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playAMidSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/a-4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playBMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        seven.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        seven.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/b4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playCMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        eight.setStyle("-fx-effect: dropshadow(gaussian, rgba(29,188,203 0.3), 10, 0.5, 0.0, 0.0);");
        eight.setFill(Paint.valueOf("#0a5a62"));
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/c4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playCMidSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/c-4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playDMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/d4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playDMidSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/d-4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playEMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/e4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playFMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/f4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playFMidSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/f-4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playGMid() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        //drop shadow and style current note
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/g4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    public void playGMidSharp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/g-4.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }

    //high

    public void playAHigh() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //reset all notes
        reset();
        AudioInputStream note;
        String clipPath = "src/main/resources/ucf/assignment/MusicNotes/a5.wav";
        note = AudioSystem.getAudioInputStream(new File(clipPath));
        Clip clip = AudioSystem.getClip();
        clip.open(note);

        //gainControl.setValue(-25.0f); // Reduce volume by 10 decibels.
        clip.start();
    }


    public void reset(){
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
    
}
