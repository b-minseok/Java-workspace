package day05;
/* OOP 언어의 4대 주요 특징
 * [1] 추상화 [Abstraction] :프로그램과 관련된 객체들을 class로 구성하는 것
 * 			관련된 속성+행동양식 ==>멤버변수+메서드
 * [2] 캡슐화 [Encapsulation)
 * [3] 다형성 Polymorphism
 * */
	public class House {
	//1.속성 ==> 멤버변수 (has a관계가 성립되어야 함)
			int room; //House has a room[o]
			//int kor; //House has a kor[x]
			String owner;//소유주
			String addr; //non-static 변수==>인스턴스 변수==>객체명.변수 식으로 접근해야 한다.
			static int count;//클래스 변수 (static변수)==>클래스명.변수 식으로 접근
	
	//2.행동양식(기능) ==> 메서드==> 동사형, 소문자로 시작,camel 표기법 사용
	public void printInfo() {
		System.out.println("---House정보---");
		System.out.println("소유주: "+owner);
		System.out.println("방 수: "+room);
		System.out.println("주 소: "+addr);
		
	}
	//거래유형:매매,전세,월세, 가격
	public String rent(String type,int price) {
		String str="";
		str+="---"+owner+"의 집-----\n";
		str+="거래 유형: "+type+"\n";
		str+="가  격: "+price+"만원\n";
		return str;
	}
}
