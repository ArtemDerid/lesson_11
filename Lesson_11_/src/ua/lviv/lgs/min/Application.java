package ua.lviv.lgs.min;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Integer[] array = new Integer[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomValueFromRange(1, 10000);
		}

		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));

	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Min must be less then max");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
