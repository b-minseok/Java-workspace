package day07;

public class Aquaman {
	String name;//이름
	int height;//키
	double speed;
	//생성자를 2개 이상 오버로딩 하세요
	
	//사용자가 생성자를 1개라도 구성하면
	//컴파일러가 제공하던 기본생성자는 사라진다
	
	public Aquaman(String name, int height, double speed) {
		this(name, height);
//		this.name=name;
//		this.height=height;
		this.speed=speed;
	}//------------
	public Aquaman(String name, int height) {
		this.name=name;
		this.height=height;
		speed=88.9;
	}//--------------------
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("키 : "+height);
		System.out.println("스피드 : "+speed);
	
	
	
	}/////////////////////////////////
}
