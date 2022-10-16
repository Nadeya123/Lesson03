package by.epam.tr.main;

public class vetvlen016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double x = - 1.75, y = 7.92;
			
			if((x > 0) & (y > 0)) {
				System.out.println("“очка находитьс€ внутри координатного угла I");
			}else if((x < 0) & (y > 0)) {
				System.out.println("“очка находитьс€ внутри координатного угла II");
			}else if((x < 0) & (y < 0)) {
				System.out.println("“очка находитьс€ внутри координатного угла III");
			}else if((x > 0) & (y < 0)) {
				System.out.println("“очка находитьс€ внутри координатного угла IV");
			}
			
	}

}
