public class IT24100017Lab7Q2B {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		String[] stars = {"- *", "- * *", "- * * *", "- * * * *", "- * * * * *"};

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " " + stars[i]);
		}
	}
}