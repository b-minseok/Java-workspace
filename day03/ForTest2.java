package day03;

public class ForTest2 {

	public static void main(String[] args) {
		//[1]for루프 이용해서 1~10까지의 합과 곱을 구해 출력하세요
		//1+2+3+....+10=55
		//1*2*3* ....*10=3628800
		int sum=0;
		int gop=1;
		for(int i=1;i<11;i++) {
			//sum=sum+i;
			sum+=i;
			//System.out.println("sum: "+sum);
			gop*=i;
			//gop=gop*1;
		}
		System.out.println("최종 sum: "+sum);
		System.out.println("최종 gop: "+gop);
		//[2] 1~20까지 정수 중 (2 또는 3의 배수)가 아닌 수를
		//출력하고, 이 수들의 총합을 구하세요
		//!(2 or 3의 배수)
		int sum2=0;
		for(int i=1;i<=20;i++) {
			//if(!(i%2==0||i%3==0))
			if(i%2!=0 && i%3!=0) {
			System.out.println(i);
			sum2+=i;
		}		
				
	}
		System.out.println("sum2: "+sum2);
		//[3] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기
		//65 ~90
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+", ");
	
	}
	System.out.println();//줄바꿈
	
	for(char c='A';c<='Z';c++) {
		System.out.print(c+", ");
	}
	System.out.println();
	
}	
	}