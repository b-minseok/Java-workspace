package day10;
/*Map계열   {K=V}
 * Properties
 * xxx.properties 유형의 파일을 읽어서 해당 파일에 저장된 내용을 자바로
 * 옮기고자 할 때 사용한다.
 * 
 * */
import java.util.*;
import java.io.*;
public class PropertiesTest {

	public static void main(String[] args) 
	throws IOException
	
	{
			
		Properties prop = new Properties();
		prop.setProperty("OS", "Windows");//Key, Value 쌍으로 저장
		prop.setProperty("Lang", "Java");
		System.out.println("사용하는 운영체제: "+prop.getProperty("OS"));
		System.out.println("사용하는 언   어:"+prop.getProperty("Lang"));
		System.out.println(prop);
		System.out.println("---------------------------");
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream("src/day10/database.properties");
		prop.load(fis);
		//XXX.properties파일을 읽어서 Properties객체로 옮겨 놓는다.
		fis.close();
		System.out.println(prop);
		
		//DbUser와 DbPwd만 가져와서 출력하세요
		System.out.println(prop.getProperty("DbUser"));
		System.out.println(prop.get("DbPwd"));
		System.out.println(prop.getProperty("WAS","Tomcat(디폴트값)"));
	}

}
