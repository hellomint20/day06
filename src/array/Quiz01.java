package array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int arr[] = {10, 54, 13, 17, 25, 30};
		/*
		출력 결과
		짝수 : 10
		짝수 : 54
		홀수 : 13 ....
		 */
		System.out.println("=== 출력 결과 ===");
		for(int num : arr) {
			if(num%2 == 0)
				System.out.println("짝수 : "+num);
			else 
				System.out.println("홀수 : "+num);
		}
		
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("짝수, 홀수 입력 : ");
		s = sc.next();
		
		for(int num : arr) {
			if(s.equals("짝수") && num%2 == 0) {
				System.out.println("짝수 : "+num);
			}else {
				if(s.equals("홀수") && num%2 != 0)
					System.out.println("홀수 : "+num);
			}
		}
	}
}
