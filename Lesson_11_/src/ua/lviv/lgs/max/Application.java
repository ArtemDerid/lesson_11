package ua.lviv.lgs.max;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Press 1 to see what carArray contains");
		System.out.println("Press 2 to set one Car object to all array elements");
	}

	public static void main(String[] args) {

		Car car = new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1990, 2019),
				new Helm(getRandomValueFromRange(13, 25), chooseMaterial()),
				new Engine(getRandomValueFromRange(1, 12)));

		Car[][] carArray = new Car[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];

		Scanner s = new Scanner(System.in);

		while (true) {
			menu();
			switch (s.next()) {
			case "1": {
				for (int i = 0; i < carArray.length; i++) {
					for (int j = 0; j < carArray[i].length; j++) {
						carArray[i][j] = new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1990, 2019),
								new Helm(getRandomValueFromRange(13, 25), chooseMaterial()),
								new Engine(getRandomValueFromRange(1, 12)));
						;
					}
				}
				System.out.println(Arrays.deepToString(carArray));
			}
				break;

			case "2": {
				for (Car [] i: carArray) {
					Arrays.fill(i, car);
					}
				System.out.println(Arrays.deepToString(carArray));
			}
				break;
			}
		}

	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Min must be less then max");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	public static String chooseMaterial() {
		String material;
		int choice = (int) (Math.random() * 2) + 1;
		if (choice == 1) {
			material = "leather";
		} else {
			material = "alcantara";
		}
		return material;
	}

}
