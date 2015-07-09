public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 1000;
		int i = 1;
		int result = 0;

		while (i < MAX) {
			if ((i % 3 == 0) || (i % 5 == 0))
				result = result + i;
			i++;

		}
		System.out.println(result);

	}
}
