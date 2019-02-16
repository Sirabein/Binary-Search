package pack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] list = new int[in.nextInt()];
		for (int i = 0; i < list.length; i++) list[i] = in.nextInt();
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		int key = in.nextInt();
		binarySearch(list, key);
	}
	
	public static void binarySearch(int[] massive, int key) {
		int mid = (massive.length - 1) / 2, min = 0, max = massive.length - 1, count = 0;
		while (massive[mid] != key) {
			if (massive[mid] > key) {
				max = mid;
				mid = min + (max - min) / 2;
			} else {
				min = mid;
				mid += (max - min) / 2;
			}
			count++;
		}
		System.out.println(mid + ", " + count);
	}

}
