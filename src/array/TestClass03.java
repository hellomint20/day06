package array;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String[] str = new String[3];
		System.out.println("str length : "+str.length);
		System.out.println("[0] : "+ str[0]);
		//null로 초기화 됨
		//대문자로 시작하는건 null 시작된다고 생각하면됨
		//int --> 0/ String --> null
		System.out.println("===================");
		
		Scanner sc =  new Scanner(System.in);
		for(int i=0; i<str.length; i++) {
			System.out.print(i+".번째 입력 : ");
			str[i] = sc.next();
		}
		System.out.println("--- 출력 ---");
		for(int i=0; i<str.length; i++) {
			System.out.println(i+"->"+str[i]);
		}
	}
}
