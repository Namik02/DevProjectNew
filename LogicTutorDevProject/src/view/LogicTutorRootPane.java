package view;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;


public class LogicTutorRootPane extends BorderPane {

	private Home homePane;
	private Login loginPane;
	private SignUp signupPane;
	private Menu menuPane;
	private LearningMaterialMenu learningmaterialMenuPane;
	private ExaminationMenu examinationmenuPane;
	private ExaminationGrades examinationGrades;
	
	private LearningMaterial1Page1 learningMaterial1Page1;
	
	private Exam1Page1 exam1Page1;
	
	private LogicTutorMenuBar mb;
	public static TabPane tp;
	
	public LogicTutorRootPane() {
		tp = new TabPane();
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		homePane = new Home();
		loginPane = new Login();
		signupPane = new SignUp();
		menuPane = new Menu();
		learningmaterialMenuPane = new LearningMaterialMenu();
		examinationmenuPane = new ExaminationMenu();
		examinationGrades = new ExaminationGrades();
		
		learningMaterial1Page1 = new LearningMaterial1Page1();
		
		exam1Page1 = new Exam1Page1();
		
		Tab t1 = new Tab("Home", homePane);
		Tab t2 = new Tab("Login", loginPane);
		Tab t3 = new Tab("Sign Up", signupPane);
		Tab t4 = new Tab("Menu", menuPane);
		Tab t5 = new Tab("Learning Mode", learningmaterialMenuPane);
		Tab t6 = new Tab("Examination Mode", examinationmenuPane);
		Tab t7 = new Tab("Examination Grades", examinationGrades);
		
		Tab t8 = new Tab("Page 1", learningMaterial1Page1);
		
		Tab t9 = new Tab("Question 1", exam1Page1);
		
		tp.getTabs().addAll(t1,t2,t3,t4,t5,t6,t7, t8,t9);
		
		mb = new LogicTutorMenuBar();
		
		this.setTop(mb);
		this.setCenter(tp);
		
	}

	public Home getHomePane() {
		return homePane;
	}
	
	public Login getLoginPane() {
		return loginPane;
	}
	
	public SignUp getSignupPane() {
		return signupPane;
	}
	
	public Menu getMenuPane() {
		return menuPane;
	}
	public LearningMaterialMenu getLearningmaterialmenuPane() {
		return learningmaterialMenuPane;
	}
	public ExaminationMenu getExaminationmenuPane() {
		return examinationmenuPane;
	}
	public ExaminationGrades getExaminationGradesPane() {
		return examinationGrades;
	}
	
	public LogicTutorMenuBar getModuleSelectionToolMenuBar() {
		return mb;
	}
	
	public Exam1Page1 getExam1Page1Pane() {
		return exam1Page1;
	}
	public LearningMaterial1Page1 getLearningMaterial1Page1Pane() {
		return learningMaterial1Page1;
	}
	
	public void changeTab(int index) {
		tp.getSelectionModel().select(index);
	}
}
