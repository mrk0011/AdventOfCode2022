import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tag1 {

	public static void main(String[] args) throws IOException {

		File myFile = new File("input.txt");
		Scanner sc = new Scanner(myFile);

		int calories = 0, maxCalories = 0;

		while (sc.hasNextInt()) {
			calories = calories + sc.nextInt();
			if (sc.nextLine().isEmpty()) {
				if (calories > maxCalories) {
					maxCalories = calories;
					calories = 0;
				}
			}
			
			System.out.println(maxCalories);

		}

		System.out.println(maxCalories);
	}
}
