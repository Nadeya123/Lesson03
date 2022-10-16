package by.epam.tr.main;

public class Cykle007 {

	public static void main(String[] args) {
		double k = 2.0;
		double x = - 0.5;
 		double y = 0.0;
		double h = 0.012;
		
			if(x > k) {
				y = x;
				System.out.println("---------------------------------");
				System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
				System.out.println("---------------------------------");		
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
				System.out.println("---------------------------------");
			}
		
			if(x <= k) {
				y = - x;
				System.out.println("---------------------------------");
				System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
				System.out.println("---------------------------------");		
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
				System.out.println("---------------------------------");
			}
	}
}

