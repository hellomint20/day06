package list;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		System.out.println(arr.size());
		System.out.println("----------------");
		arr.add("111");
		arr.add("222");
		arr.add("333");
		String s = arr.get(0);
		System.out.println("0 : "+s);
		System.out.println("---------for-------");
		for(int i =0; i< arr.size(); i++)
			System.out.println(arr.get(i));
		System.out.println("---------for each-------");
		for(String a : arr)
			System.out.println(a);
	}
}
