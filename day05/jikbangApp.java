package day05;
//직방 프로그램
//객체추출:집, 소유주, 임차인, 중개인,.....
//-->class로 구성한다 ==>추상화 (Abstraction)
public class jikbangApp {

	//등록된 집의 수
	
	public static void main(String[] args) {
		//현실세계에 존재하는 사물==>Object ===>추상화===>클래스
		//클래스 : 객체를 만들어내는 틀 (ex. 설계도, 붕어빵틀)
		//객 체 : 클래스를 통해 만들어진 구현물 (ex. 집, 붕어빵) ==>object, instance
		
		//클래스형 변수 = new 생성자();
		House h1=new House();//object
		House h2=new House();
		
		System.out.println("h1.owner: "+h1.owner);//null
		System.out.println("h2.owner: "+h2.owner);//null
		
		h1.owner="홍길동";
		h1.room=1;
		h1.addr="서울 강남구 삼성동";
		h1.count++;//1
		//House.count++;
		System.out.println("h1.count: "+h1.count);
		System.out.println("h2.count: "+h2.count);
		System.out.println("House.count: "+House.count);
		h2.owner="김철수";
		h2.room=3;
		h2.addr="서울 마포구 합정동";
		h2.count++;
		System.out.println("h1.count: "+h1.count);
		System.out.println("h2.count: "+h2.count);
		
		System.out.println("h1.owner: "+h1.owner);//
		System.out.println("h2.owner: "+h2.owner);//
		
		//printInfo()호출하기
		h1.printInfo();
		h2.printInfo();
		
		//rent()호출하기
		String info=h1.rent("전세", 5000);
		System.out.println(info);
		
		System.out.println(h2.rent("매매", 8000));
		
	}

}
