package senati;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] arr_num_tarjeta = {"12345", "45678", "78912", "34567", "15987", "35487", "35964", "35615"
				, "19578", "28648"};
		
		String[] arr_nombre = {"Carlos Perez", "Maria Vasquez", "Lucia Castillo", "Mario Vargas", "Daniel Lopez"
				, "Jose Gomez", "Luis Gutierrez", "Miguel Carrasco", "Karla Vilchez", "Grecia Fernandez"};
		
		String[] arr_cuenta = {"Cuenta Sueldo", "Cuenta ahorro", "Cuenta Sueldo", "Cuenta Sueldo", "Cuenta ahorro"
				, "Cuenta ahorro", "Cuenta Sueldo", "Cuenta ahorro", "Cuenta Sueldo", "Cuenta Sueldo"};
		
		int[] arr_clave = {3214, 6547, 9871, 4325, 4987, 3548, 6876, 4931, 6573, 4895};
		
		int[] arr_dinero = {6800, 4800, 6350, 1500, 4200, 7530, 3200, 6000, 4900, 3750};
		
		String codigo = "", estado = "";
		int clave;
		
		System.out.print("Ingrese número de tarjeta: ");
		codigo = scn.nextLine();
		
		int posicion = -1;
		
		for (int i = 0; i < arr_num_tarjeta.length; i++) {
			if (arr_num_tarjeta[i].contentEquals(codigo)) {
				posicion = i;
				break;
			}
		}
		
		if (posicion == -1)
			System.out.println("Número tarjeta no registrada");
		else {
			System.out.print("Ingrese Clave: ");
			clave = scn.nextInt();
			
			int j = 2;
			if (clave != arr_clave[posicion]) {
				while (j > 0) {
					System.out.println("\nClave incorrecta");
					System.out.println("Queda(n) " + j + " intento(s)");
					System.out.print("\nIngrese Clave: ");
					clave = scn.nextInt();
					if(clave == arr_clave[posicion]){
						System.out.println("\nDatos de la cuenta");
						System.out.println("====================");
						System.out.println("Bienvenido(a):       " + arr_nombre[posicion]);
						System.out.println("Tipo de cuenta:      " + arr_cuenta[posicion]);
						System.out.println("Sueldo actual:       S/" + arr_dinero[posicion]);
						j = 0;
					}else {
						j--;
						if (j == 0) {
							System.out.println("\nClave incorrecta");
							System.out.println("Tarjeta Bloqueada");
					    }
				    }
				}
			}else {
				System.out.println("\nDatos de la cuenta");
				System.out.println("====================");
				System.out.println("Bienvenido(a):       " + arr_nombre[posicion]);
				System.out.println("Tipo de cuenta:      " + arr_cuenta[posicion]);
				System.out.println("Sueldo actual:       S/" + arr_dinero[posicion]);
			}
		}
	}
}