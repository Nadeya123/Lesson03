package by.epam.tr.main;

public class Cykle005 {

	public static void main(String[] args) {
		int a = 1;
		int b = 99;
		int sum = 0;
		
		
		while ((a <= b) && (a % 2 != 2)) {
			sum = sum + a;
			a++;
		}
		System.out.println("sum of odd numbers > " + sum);

	}

}
