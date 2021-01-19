package exercicioVetor;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student[] vect = new Student[10];

		System.out.printf("How many rooms will be rented ? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			int valor = i + 1;
			System.out.println("Rent #" + valor);
			System.out.printf("Name: ");
			String nome = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			if(room>9) {
				while (room>9) {
					System.out.printf("Numero invalido, digite outro: ");
					room = sc.nextInt();
					sc.nextLine();
				}
				vect[room] = new Student(nome, email,room);
			}
			else {
			vect[room] = new Student(nome, email,room);
			}
		}
		
		System.out.println("Busy Rooms: ");

		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i]!=null) {
			
			System.out.println(vect[i].toString());
			}
			
		}
		sc.close();
	}
}