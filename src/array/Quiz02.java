package array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		int arr[] = {10, 54, 13, 17, 25, 30};
		Scanner sc = new Scanner(System.in);
		String msg;
		System.out.print("짝, 홀 입력 : ");
		msg = sc.next();
		/*	index 번호로 짝, 홀 출력	*/
		for(int i=0; i<arr.length; i+=2) {
			if(msg.equals("짝")) {
				System.out.println(arr[i]);
			}else {
				System.out.println(arr[i+1]);
			}
		}
		System.out.println("---------------");
		for(int k = (msg.equals("짝")?0:1);
						k<arr.length; k+=2) {
			System.out.println(k+"->"+arr[k]);
		}
	}
}
