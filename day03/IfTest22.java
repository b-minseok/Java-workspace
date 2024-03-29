package day03;
import java.util.Scanner;
public class IfTest22 {

	public static void main(String[] args) {
		//입력값이
		//11 22 33 44 55 ....
		//==> "OK 10의 자리와 1의 자리가 같아요"
		//그렇지 않으면 "NO 10의 자리와 1의 자리가 달라요"를 출력하세요
		System.out.println("2자리 양의 정수를 입력하세요=>");
		
		//유효성 체크 : 2자리가 아닐 경우
		//"입력 오류!! 2자리 정수여야 해요"
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<10||num>99) {
			System.out.println("입력 오류!! 2자리 정수여야 해요");
			return;
		}
		
		if(num%11==0) {
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		}else {
			System.out.println("NO 10의 자리와 1의 자리가 달라요");
		}
		
		int n1=num/10;
		int n2=num%10;
		System.out.println("n1: "+n1+", n2: "+n2);
		
		if(n1==n2) {
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		}else {
			System.out.println("NO 10의 자리와 1의 자리가 달라요");
		}

		//삼항 연산자로 바꿔보기
		String result=(n1==n2)? "OK같아요***":"NO달라요###";
		System.out.println(result);
		
		
		System.out.println((num%11==0)?"OK Same":"No Not Same");//1회용
		
		System.out.println(result.toLowerCase());//재사용
	}

}
