package exam01_generic;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
	}

}
