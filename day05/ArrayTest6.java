package day05;
import java.util.*;
public class ArrayTest6 {
	
	
	public static void solutuin1() {
		System.out.println("--성적 확인 문제------");
		String subject[]= {"국어","수학","영어","과탐","사탐"};
		//1학기 성적
		int[] term1= {99, 75 , 82, 50, 48};
		//2학기 성적
		int[] term2= {80, 82 , 100, 50, 42};
		
		//1.성적이 2학기에 향상된 과목수를 출력
		int up_cnt=0, same_cnt=0;
		String str="", str2="";
		for (int i=0;i<term1.length;i++) {
			if(term1[i] < term2[i]) {
				up_cnt++;
				str+=subject[i]+", ";
			}else if(term1[i]==term2[i]) {
				same_cnt++;
				str2+=subject[i]+", ";
			}
		}
		System.out.println("2학기에 향상된 과목수: "+up_cnt+"개, 과목명: "+str);
		//2.성적이 1, 2학기 동일한 과목수,과목명을 출력
		System.out.println("1,2학기 점수가 동일한 과목수: "+same_cnt+"개, 과목명: "+str2);
	}//---------------------------------------------
	//교안 90p 풀기
	public void solution2() {
		System.out.println("--토익 문제 채점--------");
		int answer[][]=new int[990][2];
		Random ran=new Random();
		int score=0;
		System.out.println("*****************");
		System.out.println(" 번호\t정답\t내답");
		System.out.println("*****************");
		for(int i=0;i<answer.length;i++) {
			answer[i][0]=ran.nextInt(4)+1; //정답 저장
			answer[i][1]=ran.nextInt(4)+1; //내답 저장
			if(answer[i][0] == answer[i][1])
				score++;
			System.out.printf(" %3d\t%d\t%d\n", i+1, answer[i][0], answer[i][1]);
		}
		System.out.println("*****************");
		System.out.printf("내 토익 점수: %3d점\n", score);
	}//---------------------------------
	
	public static void main(String[] args) {
		//solution1()호출
		ArrayTest6.solutuin1();
		
		//solution2()호출
		new ArrayTest6().solution2();
		
	}

}
