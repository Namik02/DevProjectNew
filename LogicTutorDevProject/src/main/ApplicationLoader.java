 
package main;

import controller.LogicTutorController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.StudentProfile;
import view.LogicTutorRootPane;

public class ApplicationLoader extends Application {

	private LogicTutorRootPane view;
	
	@Override
	public void init() {
		view = new LogicTutorRootPane();
		StudentProfile model = new StudentProfile();
		new LogicTutorController(view, model);	
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setMinWidth(530); 
		stage.setMinHeight(500);
		
		stage.setTitle("Logic Tutor");
		stage.setScene(new Scene(view));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
