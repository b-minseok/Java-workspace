package day03;

public class Operator {
	
	public static void main(String[] args) {
		System.out.println("===논리 연산자()------");
		/* 1)& (and)
		 * 2)| (or)
		 * : 앞의 연산으로 결과를 알 수 있어도 뒤의 문장까지 비교를 한다
		 * 3)&&
		 * 4)||
		 * : &&의 경우 앞의 연산 결과가 false이면 뒤의 연산을 생략한다
		 * : ||의 경우 앞의 연산 결과가 true이면 뒤의 연산을 생략한다
		 * */
		//[문제1]
		
		int i=1;
		int j=i++;
		if((i>++j)&&(i++ ==j)) {
			i=i+j;
		}
		System.out.println("i="+i);
		
		//[문제2]
		int k=0;
		int p=1;
		if((k++ ==0)||(p++ ==2)) {
			
			k=42;
			
		}
		
		
		System.out.println("k="+k+", p="+p);
		
		
		
		
	}//main()--------------------------------

}//class----------------------------------
