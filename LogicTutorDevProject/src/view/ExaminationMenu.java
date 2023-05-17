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

public class ExaminationMenu extends GridPane {

	private Button btnLearningMaterial1;
	private Button btnMenu;


	public ExaminationMenu() {
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);

		this.getColumnConstraints().addAll(column0);

				
		btnLearningMaterial1 = new Button("Example");

		btnMenu = new Button("Menu");

		this.add(btnLearningMaterial1, 0, 0);

		this.add(btnMenu, 0, 3);


	}
	
	
	
	//method to attach the create student profile button event handler
	public void addE1Q1Handler(EventHandler<ActionEvent> handler) {
		btnLearningMaterial1.setOnAction(handler);
	}
	public void addBtnMenuHandler(EventHandler<ActionEvent> handler) {
		btnMenu.setOnAction(handler);
	}

}