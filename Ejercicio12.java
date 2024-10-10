package ejercicios_tema_2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		do {
			System.out.println("Introduce un username");

			username = sc.nextLine().toUpperCase().trim();

			if (username.length() < 10) {
				System.out.println("Debe contener al menos 10 caracteres");
			} else if (username.contains(" ")) {
				System.out.println("Tu username no puede contener espacios");
			} else {
				System.out.println("Tu username ha sido registrado como \"" + username + "\"");
			}
		} while (username.length() < 10 || username.contains(" "));

		sc.close();
	}

}
