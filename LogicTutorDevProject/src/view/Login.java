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


public class Login extends GridPane {

	Label lbl1 = new Label("Username");
	Label lbl2 = new Label("Password");
	private Button btnLogin;
	private Button btnBack;
	private static TextField txtUsername;
	private static TextField txtPassword;


	public Login() {
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
		btnLogin = new Button("Log In");
		btnBack = new Button("Back");
		
		//add controls and labels to container
		this.add(lbl1, 0, 0);
		this.add(txtUsername, 1, 0);
		this.add(lbl2, 0, 1);
		this.add(txtPassword, 1, 1);
		
		this.add(btnLogin, 1, 3);
		this.add(btnBack, 1, 5);


	}

	public void addBtnHomeHandler(EventHandler<ActionEvent> handler) {
		btnBack.setOnAction(handler);
	}
	public void addBtnLoginHandler(EventHandler<ActionEvent> handler) {
		btnLogin.setOnAction(handler);
	}
	
}
