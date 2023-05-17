package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.StudentProfile;
import view.LogicTutorRootPane;
import view.Login;
import view.Menu;
import view.SignUp;
import view.Exam1Page1;
import view.ExaminationGrades;
import view.ExaminationMenu;
import view.Home;
import view.LearningMaterial1Page1;
import view.LearningMaterialMenu;
import view.LogicTutorMenuBar;

public class LogicTutorController {

	private LogicTutorRootPane view;
	
	private Home homePane;
	private Login loginPane;
	private SignUp signupPane;
	private Menu menu;
	private LearningMaterialMenu learningMaterialMenu;
	private ExaminationMenu examinationMenu;
	private ExaminationGrades examinationGrades;
	
	private LearningMaterial1Page1 learningMaterial1Page1;
	private Exam1Page1 exam1Page1;
	
	private LogicTutorMenuBar mb;

	public LogicTutorController(LogicTutorRootPane view, StudentProfile model) {
		this.view = view;
		
		homePane = view.getHomePane();
		loginPane = view.getLoginPane();
		signupPane = view.getSignupPane();
		menu = view.getMenuPane();
		learningMaterialMenu = view.getLearningmaterialmenuPane();
		examinationMenu = view.getExaminationmenuPane();
		examinationGrades = view.getExaminationGradesPane();
		
		learningMaterial1Page1 = view.getLearningMaterial1Page1Pane();
		exam1Page1 = view.getExam1Page1Pane();
			
		mb = view.getModuleSelectionToolMenuBar();

		this.attachEventHandlers();	
	}

	

	private void attachEventHandlers() {

		homePane.addBtnLoginHandler(new BtnLoginHandler());
		homePane.addBtnSignUpHandler(new BtnSignUpHandler());
		loginPane.addBtnHomeHandler(new BtnHomeHandler());
		loginPane.addBtnLoginHandler(new BtnMenuHandler());
		signupPane.addBtnHomeHandler(new BtnHomeHandler());
		signupPane.addBtnSignupHandler(new BtnMenuHandler());
		menu.addBtnHomeHandler(new BtnHomeHandler());
		menu.addBtnLearningMaterialMenuHandler(new BtnLearningMaterialMenuHandler());
		menu.addBtnExaminationMenuHandler(new BtnExaminationMenuHandler());
		learningMaterialMenu.addBtnMenuHandler(new BtnMenuHandler());
		learningMaterialMenu.addL1P1Handler(new BtnL1P1Handler());
		examinationMenu.addBtnMenuHandler(new BtnMenuHandler());
		examinationMenu.addE1Q1Handler(new BtnE1Q1Handler());
		examinationGrades.addBtnBackHandler(new BtnExaminationMenuHandler());
		
		learningMaterial1Page1.addBtnBackHandler(new BtnLearningMaterialMenuHandler());
		exam1Page1.addBtnBackHandler(new BtnExaminationMenuHandler());
		
		mb.addExitHandler(e -> System.exit(0));
	}
	
	private class BtnLoginHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(1);
		}
	}
	private class BtnSignUpHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(2);
		}
	}
	private class BtnHomeHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(0);
		}
	}
	private class BtnMenuHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(3);
		}
	}
	private class BtnLearningMaterialMenuHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(4);
		}
	}
	
	private class BtnExaminationMenuHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(5);
		}
	}
	
	
	private class BtnL1P1Handler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(7);
		}
	}
	
	private class BtnE1Q1Handler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			LogicTutorRootPane.tp.getSelectionModel().select(8);
		}
	}
	
	
	private class BtnSubmitHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			
//			if (exam1Page1.getRadio3().isSelected())
//			{
//			labelresponse.setText("Correct answer");
//			btnSubmit.setDisable(true);
//			}
//			   
//			else
//			{
//			labelresponse.setText("Wrong answer");
//			btnSubmit.setDisable(true);
//			}           
//			}
//			);
		}
	}



}
