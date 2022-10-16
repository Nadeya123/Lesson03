package by.epam.tr.main;

public class cykle014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a;
			double n;
			double sum;
			
			a = 1;
			n = 5;
			
			sum = 0;
			
			while(a <= n) {
				sum = sum  + 1 / a;
				a++;
			}
			System.out.println(sum + " ");
	}

}
