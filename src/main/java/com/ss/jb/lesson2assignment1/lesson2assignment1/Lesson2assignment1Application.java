package com.ss.jb.lesson2assignment1.lesson2assignment1;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lesson2assignment1Application {

	public static void main(String[] args) {
		System.out.println("Please enter the numbers you'd like to add separated by spaces.");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		String[] numStringArray = numbers.split(" ");
		int[] numIntArray = new int[numStringArray.length];
		int index = 0;
		for (String num : numStringArray) {
			numIntArray[index] = Integer.parseInt(num);
			index++;
		};
		IntStream numStream = IntStream.of(numIntArray);
		int sum = numStream.sum();
		System.out.println("The sum of your numbers is : " + sum);
		
	};

}
