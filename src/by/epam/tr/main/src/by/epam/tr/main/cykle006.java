package by.epam.tr.main;

import java.util.Scanner;

public class cykle006 {

	public static void main(String[] args) {
		
		int x;
		int sum;
		
		x = 1;
		sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.println("������� ����� �����.");
		System.out.print("> ");
		while(!sc.hasNext()) {
			sc.nextLine();
			System.out.println("�� ����� �� ����� �����.");
			System.out.print("> ");
		}
		y =sc.nextInt();
		System.out.println("�� ����� " + y);
		
		while(x <= y) {
			sum = sum + x;
			x++;
		}
		
		System.out.println("sum = " + sum);
	}
}	