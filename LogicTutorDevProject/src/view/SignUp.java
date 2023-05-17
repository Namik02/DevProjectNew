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


public class SignUp extends GridPane {

	Label lbl1 = new Label("Username");
	Label lbl2 = new Label("Password");
	Label lbl3 = new Label("Confirm Password");
	private Button btnSignUp;
	private Button btnBack;
	private static TextField txtUsername;
	private static TextField txtPassword;
	private static TextField txtConfirmPassword;
	

	public SignUp() {
		//styling
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);

		this.getColumnConstraints().addAll(column0);

				
		//initialise create profile button
		txtUsername = new TextField();
		txtPassword = new TextField();
		txtConfirmPassword = new TextField();
//		btnLogin = new Button("Log In");
		btnBack = new Button("Back");
		btnSignUp = new Button("Sign Up");

		//add controls and labels to container
		this.add(lbl1, 0, 0);
		this.add(txtUsername, 1, 0);
		this.add(lbl2, 0, 1);
		this.add(txtPassword, 1, 1);
		this.add(lbl3, 0, 2);
		this.add(txtConfirmPassword, 1, 2);
		
//		this.add(btnLogin, 1, 3);
		this.add(btnBack, 1, 5);
		this.add(btnSignUp, 1, 3);


	}
	public void addBtnHomeHandler(EventHandler<ActionEvent> handler) {
		btnBack.setOnAction(handler);
	}
	public void addBtnSignupHandler(EventHandler<ActionEvent> handler) {
		btnSignUp.setOnAction(handler);
	}
	
}
