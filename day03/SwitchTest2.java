package day03;
import java.util.Scanner;
public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("사번을 입력하세요 [예 A100EX]=>");
		String no=sc.next();
		System.out.println("no: "+no);
	
		//A: 기획부 사원이며 사원의 고유번호는 100EX이다.
		//B: 총무부 사원이며 사원의 고유번호는 100EX이다.
		//C: 개발부 사원이며 사원의 고유번호는 100EX이다.
		// 나머지: 해당부서 없음
		
		char ch=no.charAt(0);
		System.out.println("부서코드: "+ch);
		//String 클래스의 메서드
				/* char charAt(int index) : index위치의 문자 1개를 추출해서 반환
				 * String substring(int start, int end)
				 * : index번소 start위치에서 시작해서 end-1까지의 문자열을 추출해서 반환
				 * */
			String str=no.substring(1, 6);
			//System.out.println(str);
			String dept="";
			
			switch(ch) {
				case 'A': dept="기획부";break;
				case 'B': dept="총무부";break;
				case 'C': dept="개발부";break;
				default:
					System.out.println("해당 부서 없음");
					return;
			}//switch---------
			System.out.println(dept+" 사원이며 사원의 고유번호는 "+str+"입니다.");
		
		
	
	
	
	}////main

}//class
