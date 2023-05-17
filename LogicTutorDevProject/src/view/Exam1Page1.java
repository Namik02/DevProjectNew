package view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Exam1Page1 extends GridPane {

	Button btnBack;
	RadioButton radio1, radio2,radio3,radio4;
	Button btnSubmit;

	public Exam1Page1() {
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);

		this.getColumnConstraints().addAll(column0);

		Label labelfirst= new Label("What is 10 + 20?");
		Label labelresponse= new Label();
		        

		btnSubmit = new Button("Submit");

		
		radio1=new RadioButton("10");
		radio2= new RadioButton("20");
		radio3= new RadioButton("30");
		radio4= new RadioButton("40");
		
		ToggleGroup question1= new ToggleGroup();
		radio1.setToggleGroup(question1);
		radio2.setToggleGroup(question1);
		getRadio3().setToggleGroup(question1);
		radio4.setToggleGroup(question1);
		
		btnBack = new Button("Back");
		
		
		btnSubmit.setDisable(false);

		this.add(labelfirst, 1, 0);
		this.add(radio1, 1, 1);
		this.add(radio2, 1, 2);
		this.add(getRadio3(), 1, 3);
		this.add(radio4, 1, 4);
		this.add(btnSubmit, 0, 6);
		this.add(btnBack, 1, 6);
		this.add(labelresponse, 1, 7);

		btnSubmit.setOnAction(e -> 
		{

		if (getRadio3().isSelected())
		{
		labelresponse.setText("Correct answer");
		btnSubmit.setDisable(true);
		}
		   
		else
		{
		labelresponse.setText("Wrong answer");
		btnSubmit.setDisable(true);
		}           
		}
		);

	}
	
	
	
	//method to attach the create student profile button event handler
	public void addBtnBackHandler(EventHandler<ActionEvent> handler) {
		btnBack.setOnAction(handler);
	}
	
	public void addQuestionButton(EventHandler<ActionEvent> handler) {
		btnSubmit.setOnAction(handler);
	}



	public RadioButton getRadio3() {
		return radio3;
	}



//	public void setRadio3(RadioButton radio3) {
//		this.radio3 = radio3;
//	}

}