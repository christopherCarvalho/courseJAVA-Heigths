package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Heights;
import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many entries will there be?");
		int n = sc.nextInt();
		Heights[] height = new Heights[n];	

		int minor = 0;
		double sumHeigth = 0;

		for (int i = 0; i < height.length; i++) {
			sc.nextLine();
			System.out.print((i + 1) + "º Person data: \n");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double heights = sc.nextDouble();

			height[i] = new Heights(name, age, heights);

		}

		for (int i = 0; i < height.length; i++)
			{
				sumHeigth += height[i].getHeight();

				if (height[i].getAge() < 16) 
				{
					minor+=1;
				}
		}		
		
		System.out.printf("Average heights: %.2f%n",Calculator.average(sumHeigth, n));
		System.out.printf("People under 16 years old: %.1f%%",Calculator.percentage(minor, n) );

		sc.close();
	}

}
