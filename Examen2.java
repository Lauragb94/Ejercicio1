public class Examen2 {
	public static void main(String[] args) {
		
		System.out.print("Introduce un número: ");
		int n = Integer.parseInt(System.console().readLine());
		
		if ((n % 2 == 0) && (n % 3 == 0)) {
			System.out.print("El número es divisible entre 2 y 3.");
		}
		else if ((n % 2 == 0) && (n % 3 != 0)) {
			System.out.print("El número solo es divisible entre 2.");
		}
		else if ((n % 2 != 0) && (n % 3 == 0)) {
			System.out.print("El número solo es divisible entre 3.");
		} else {
			System.out.print("El número no puede dividirse ni entre 2 ni entre 3.");
		}
	}
}
