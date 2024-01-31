package day06;
//캡슐화,setter, getter
public class JobKoreaApp {

	public static void main(String[] args) {

		//JobSeeker 객체 1개 생성해서 속성값을 각각 부여한 뒤
		//profile()메서드를 호출해 정보를 출력하세요
		JobSeeker js1=new JobSeeker();
		//js1.name="김철수";
		js1.setName("김철수");
		//js1.birth=1992;
		js1.setBirth(1992);
		//js1.phone="010-2222-3333";
		js1.setPhone("010-2222-3333");
		//js1.gender='M';
		js1.setGender('M');
	
		String str=js1.profile();
		System.out.println(str);
		
		//[1] 구직자 객체를 1개 더 생성하고 속성값 부여 프로필출력
		JobSeeker js2=new JobSeeker();
		//js2.Name("강제니");
		js2.setName("강제니");
		js2.setBirth(1993);
		js2.setPhone("010-4545-8989");
		js2.setGender('F');
		System.out.println(js2.profile());
		
		
		//[2] 위에서 생성한 구직자 객체 2개를 배열에 저장한 뒤
		//   반복문 이용해서 구직자 정보를 모두 출력하세요
		JobSeeker[] arr=new JobSeeker[2];
		arr[0]=js1;
		arr[1]=js2;
		
		System.out.println("********************");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].profile());
		}
		System.out.println("#################");
		//for-each루프로 출력
		for(JobSeeker seeker:arr) {
			//System.out.println(seeker.profile());
			System.out.println(seeker.getName());
		}
		
		
	}

}
