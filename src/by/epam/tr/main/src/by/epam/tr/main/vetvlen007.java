package by.epam.tr.main;

public class vetvlen007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a = 4.4;
			double b = -1.78;
			double c = 4.32;
			double x = 9.0;
			double f = 0;
			
			if(x >= 0) {
				f = (a * x * x) + (b * x) + c;
			}else {
				f = - (a * x * x) + (b * x) + c;
			}
			System.out.println("f =" + f);
	}

}
