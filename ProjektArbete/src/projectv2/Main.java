package projectv2;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage primaryStage) {
		Game game = new Game();
		game.runGame(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	}