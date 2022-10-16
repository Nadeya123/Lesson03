package by.epam.tr.main;

import java.util.Scanner;

public class vetvlen021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String g = "g"; 
			String b = "b";
			String str;
			
		Scanner sc = new Scanner(System.in);
			System.out.println("Кто ты? Мальчик или девочка? Введи g (girl) или b (boy)");
			System.out.print("> ");
			str = sc.nextLine();
			
			if(g.equals(str)) {
				System.out.println("I like girls :)");
			}else if(b.equals(str)) {
				System.out.println("I like boys :)");
			}else {
				System.out.println("Не правильный символ");
			}
			
	}

}