package by.epam.tr.main;

public class cykle009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x;
			int y;
			int sum;
			
			x = 1;
			y = 100;
			sum = 0;
			
			for(int i = x; i <= y; i++) {
				sum = (int) (sum + Math.pow(i, 2));
			}
		
			System.out.println("sum =" + sum);
	}

}
