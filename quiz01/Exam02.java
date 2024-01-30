package quiz01;
import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String height=JOptionPane.showInputDialog("키가 얼마입니까?");
		double weight=(Double.parseDouble(height)-100)*0.9;
		System.out.println("적정 몸무게: "+weight);
		
	}

}
