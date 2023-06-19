package array;

public class TestClass02 {
	public static void main(String[] args) {
		double dos[] = new double[] { 1.11, 2.22, 3.33};
		//double dos[] = { 1.11, 2.22, 3.33};
		System.out.println("dos length : "+dos.length);
		for(int i =0; i<dos.length; i++) {
			System.out.println(i+"->"+dos[i]);
		}
	}
}
