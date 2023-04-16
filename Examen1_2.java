public class Examen1_2 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Tabla del " + i);
			System.out.println("------------");
				for (int j = 0; j <= 10; j++) {
					
					int m = i * j;
					
					System.out.println(i + " x " + j + " = " + m);
				}
				System.out.println(" ");
			}
		}
	}
