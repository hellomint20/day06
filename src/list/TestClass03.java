package list;

import java.util.ArrayList;

public class TestClass03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는 값"));
		
		boolean bool = arr.contains("없는 값");
		System.out.println("bool : "+bool);
		
		System.out.println("--------remove--------");
		System.out.println("삭제 전 : "+arr);
		arr.remove(0);	//index로 삭제
		System.out.println("0번째 삭제 후 값 : "+arr);
		arr.remove("333");
		System.out.println("333 삭제 후 값 : "+arr);
	}
}
