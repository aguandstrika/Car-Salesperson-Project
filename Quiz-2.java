import java.util.Scanner;

/*
Quiz class
Requirements:
Student name
Course
An array of questions
An array of scores for each question
Quiz grading
 */
public class Quiz {
	private String studentName;
	private String courseName;
	private Question[] questions;
	private double[] qScores;
	private double[] qVals;
	final private int MAXQUESTIONS=100;// some unused space
	private int numOfQuestions;
	
	// CONSTRUCTORS
	// #Constructor 1. it is parameter constructor
	public Quiz(String studentName,String courseName,int numOfQuestions) {
		this.studentName=studentName;
		this.courseName=courseName;
		questions=new Question[MAXQUESTIONS];
		qScores=new double[MAXQUESTIONS];
		qVals=new double[MAXQUESTIONS];
		this.numOfQuestions=numOfQuestions;
	}
	// #Constructor 2. Create a Quiz template for course from user
	public Quiz() {
		Scanner input=new Scanner(System.in);
		String qType;
		studentName="";// It did not take the quiz yet
		System.out.print("Enter course name: ");
		courseName=input.nextLine();
		System.out.print("Enter the number of questions in the quiz: ");
		numOfQuestions=Integer.parseInt(input.nextLine());
		questions=new Question[MAXQUESTIONS];
		qScores=new double[MAXQUESTIONS];
		qVals=new double[MAXQUESTIONS];
		for(int i=0;i<numOfQuestions;i++) {
			System.out.print("Enter type of the next question(MCSA,MCSA,TF): ");
			qType=input.nextLine();
			if(qType.equalsIgnoreCase("MCSA"))
				questions[i]=new QuestionMCSA(input);
			else if(qType.equalsIgnoreCase("MCMA"))
				questions[i]=new QuestionMCMA(input);
			else
				questions[i]=new QuestionTF(input);
			qVals[i]=questions[i].getQVal();
		}
	}
	// #Constructor 3. Create a Quiz template for course from file
	public Quiz(Scanner input) {
		int qType;
		studentName="";// It did not take the quiz yet
		courseName=input.nextLine();//course name
		numOfQuestions=Integer.parseInt(input.nextLine());//number of questions
		questions=new Question[MAXQUESTIONS];
		qScores=new double[MAXQUESTIONS];
		qVals=new double[MAXQUESTIONS];
		for(int i=0;i<numOfQuestions;i++) {
			qType=Integer.parseInt(input.nextLine());
			if(qType==1)
				questions[i]=new QuestionMCSA(input);
			else if(qType==2)
				questions[i]=new QuestionMCMA(input);
			else
				questions[i]=new QuestionTF(input);
			
			qVals[i]=questions[i].getQVal();
		}
		
	}
	// Method to take quiz
		
	public void takeQuiz(String studentName) {
		Scanner input=new Scanner(System.in);
		
		this.studentName=studentName;
		for(int i=0;i<numOfQuestions;i++) {
			System.out.print(questions[i]);
			qScores[i]=questions[i].getScoreUser();
		}
	}
	
	public void quizReport() {
		System.out.println("Student: "+studentName);
		System.out.println("Course: "+courseName);
		System.out.println("Number of Questions: "+numOfQuestions);
		double totalScore=0,maxScore=0;
		System.out.println("Q# | Q Score");
		for( int i=0;i<numOfQuestions;i++) {
			System.out.printf("%2d",(i+1));
			System.out.printf("%12.1f",qScores[i]);
			totalScore+=qScores[i];
			maxScore+=qVals[i];
			System.out.println();
		}
		System.out.printf("Quiz grade: %3.1f ",100*totalScore/maxScore);
	}
	
	
	
	public String toString() {
		String msg="Quiz\n";
		msg+="Student: "+studentName+"\n";
		msg+="Course: "+courseName+"\n";
		for(int i=0;i<questions.length;i++) {
			msg+=questions[i].toString();
			msg+="scores: "+qScores[i]+"\n";
		}
		return msg;
		
	}
	
}