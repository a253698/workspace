package exam.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		
		int[] numbers = { 45, 81, 9, 72, 4, 6 };
		// 例2: int[] numbers = { 6, 5, 2, 8, 1, 9, 13, 4, 11, 7 };

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				// System.out.println(i + " " + j);
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

}
