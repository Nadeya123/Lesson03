package by.epam.tr.main;

public class cykle022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a;
			double b;
			double h;
			double y;
			
			a = 2;
			b = 8;
			h = 0.4;
			
			System.out.println("---------------------------------");
			System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
			System.out.println("---------------------------------");
			
			for(double x = a; x <= b; x = x + h) {
				y = Math.pow((Math.sin(x)), 2.0);
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
			System.out.println("---------------------------------");
	}
}
