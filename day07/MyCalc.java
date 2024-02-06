package day07;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MyCalc extends JFrame {
	
	Container cp;//내용물(부품)을 붙이는 플랫폼 역할을 함
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	//기본생성자 구성하세요
	public MyCalc() {
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MyCalc.class.getResource("/day07/calc.PNG")));
		lblNewLabel.setBounds(12, 10, 460, 196);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(12, 234, 99, 64);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(12, 308, 99, 64);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();//숫자1 입력박스
		textField.setBounds(140, 245, 277, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();//숫자2 입력박스
		textField_1.setColumns(10);
		textField_1.setBounds(140, 320, 277, 50);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(textField_1, "더하기 버튼을 눌렀군요");
				//숫자1 입력박스에 입력한 값 얻어오기
				String str1=textField.getText();
				setTitle("숫자1: "+str1);
				//숫자2 입력박스에 입력한 값 얻어오기
				
				//숫자1+숫자2 더한 값을 결과 입력박스에 넣어준다
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 23));
		btnNewButton.setBounds(107, 453, 149, 87);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 23));
		btnNewButton_1.setBounds(268, 453, 149, 87);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("결  과");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1_1_1.setBounds(12, 382, 99, 64);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();//결과 입력박스
		textField_2.setColumns(10);
		textField_2.setBounds(140, 382, 277, 50);
		panel.add(textField_2);
		
	}//기본생성자---------------

	public static void main(String[] args) {
		
		MyCalc my=new MyCalc();//MyCalc는 JFrame(상속)
		my.setSize(500,600);
		my.setVisible(true);
	}
}
