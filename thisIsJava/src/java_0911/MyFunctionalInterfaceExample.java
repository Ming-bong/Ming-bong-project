package java_0911;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		// method() ȣ���� ���ٽ��� �߰�ȣ�� �����Ų��.

	}
}
