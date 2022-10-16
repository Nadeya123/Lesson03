package by.epam.tr.main;

public class Cykle003 {

	public static void main(String[] args) {
		int w = 3;
		int p = 10;
		int mn;
		
		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\t%4s\t|\n", "p", "w", "mn");
		System.out.println("-------------------------------------------------");
		for(int i = 1; i <= p; i++) {
			mn = w * i;
			System.out.printf("|\t%4d\t|\t%4d\t|\t%4d\t|\n", i, w, mn);
		}
		System.out.println("--------------------------------------------------");
	}

}
