import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class VideoPlayer extends Application {
    private static final String VIDEO_FILE_PATH = "path/to/your/video.mp4";

    @Override
    public void start(Stage primaryStage) {
        // Создаем объект Media с путем к видеофайлу
        Media media = new Media(new File(VIDEO_FILE_PATH).toURI().toString());

        // Создаем объект MediaPlayer с объектом Media
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Создаем объект MediaView и устанавливаем MediaPlayer
        MediaView mediaView = new MediaView(mediaPlayer);

        // Создаем корневой контейнер и добавляем MediaView
        StackPane root = new StackPane();
        root.getChildren().add(mediaView);

        // Создаем сцену и устанавливаем ее на primaryStage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Video Player");
        primaryStage.show();

        // Запускаем воспроизведение видео
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}