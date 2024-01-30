package quiz01;
import javax.swing.JOptionPane;
public class Exam01 {

	public static void main(String[] args) {
		
		String a= JOptionPane.showInputDialog("사격형의 가로 길이는?");
		String b= JOptionPane.showInputDialog("사격형의 세로 길이는?");
		
		int c = Integer.parseInt(a)*Integer.parseInt(b);
		System.out.println("사각형의 면적: "+c);
		
	}

}
