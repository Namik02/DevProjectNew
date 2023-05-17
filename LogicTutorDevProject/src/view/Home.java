package view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Home extends GridPane {

	private Button btnLogin;
	private Button btnSignUp;

	public Home() {
		//styling
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);

		this.getColumnConstraints().addAll(column0);

				
		//initialise create profile button
		btnLogin = new Button("Log In");
		btnSignUp = new Button("Sign Up");

		//add controls and labels to container
		this.add(btnLogin, 0, 0);
		this.add(btnSignUp, 0, 1);


	}
	
	
	
	//method to attach the create student profile button event handler
	public void addBtnLoginHandler(EventHandler<ActionEvent> handler) {
		btnLogin.setOnAction(handler);
	}
	public void addBtnSignUpHandler(EventHandler<ActionEvent> handler) {
		btnSignUp.setOnAction(handler);
	}

}
