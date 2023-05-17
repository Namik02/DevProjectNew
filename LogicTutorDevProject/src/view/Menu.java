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


public class Menu extends GridPane {

	private Button btnLearningMaterialMenu;
	private Button btnExaminationMenu;
	private Button btnHome;


	public Menu() {
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);

		this.getColumnConstraints().addAll(column0);

				
		btnLearningMaterialMenu = new Button("Learning Mode");
		btnExaminationMenu = new Button("Examination Mode");
		btnHome = new Button("Home");

		this.add(btnLearningMaterialMenu, 0, 0);
		this.add(btnExaminationMenu, 0, 1);
		this.add(btnHome, 0, 3);


	}
	
	
	
	//method to attach the create student profile button event handler
	public void addBtnLearningMaterialMenuHandler(EventHandler<ActionEvent> handler) {
		btnLearningMaterialMenu.setOnAction(handler);
	}
	public void addBtnExaminationMenuHandler(EventHandler<ActionEvent> handler) {
		btnExaminationMenu.setOnAction(handler);
	}
	public void addBtnHomeHandler(EventHandler<ActionEvent> handler) {
		btnHome.setOnAction(handler);
	}

}