package by.epam.tr.main;

public class vetvlen026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int d;
			int o;
			int w;
			int sum;
			
			d = 6;
			o = 7;
			w = 1;
			sum = 0;
			
			if((o < d) & (d < w)) {
				sum = o + w;
			}else if ((w < d) & (d < o)) {
				sum = o + w;
			}else if ((d < o) & (o < w)) {
				sum = d + w;
			}else if ((w < o) & (o < d)) {
				sum = d + w;
			}else if ((d < w) & (w < o)) {
				sum = d + o;
			}else if ((o < w) & (w < d)) {
				sum = d + o;
			}
			
			System.out.println("sum = " + sum);

	}
}
