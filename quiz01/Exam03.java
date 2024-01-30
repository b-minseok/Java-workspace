package quiz01;
import javax.swing.JOptionPane;
public class Exam03 {

	public static void main(String[] args) {
		String telecom=JOptionPane.showInputDialog("통신사를 입력하세요");
		String number=JOptionPane.showInputDialog("전화번호를 입력하세요");
		String name=JOptionPane.showInputDialog("가입자이름을 입력하세요");
		
		System.out.println(name+"님은 "+telecom+"에 "+number);
	}

}
