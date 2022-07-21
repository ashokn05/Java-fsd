package methods;

public class Methods {

	public int addnumbers(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Methods b = new Methods();
		int result = b.addnumbers(4, 7);
		System.out.println("Addition is :" + result);
	}
}
