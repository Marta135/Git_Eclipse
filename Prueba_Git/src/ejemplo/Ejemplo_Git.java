/*Programa Java para leer las longitudes de los lados de un triangulo
 *y calcular el área del mismo de acuerdo con la fórmula */

package ejemplo;

import java.util.Scanner;

public class Ejemplo_Git {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la longitud del primer lado:");
		float lado1 = teclado.nextFloat();
		
		System.out.println("Introduzca la longitud del segundo lado:");
		float lado2 = teclado.nextFloat();
		
		System.out.println("Introduzca la longitud del tercer lado:");
		float lado3 = teclado.nextFloat();

		boolean comprobacion=lado1<=0||lado2<=0||lado3<=0;
		float sp=(lado1+lado2+lado3)/2;
		
		System.out.println(comprobacion?"Ha introducido algun valor no valido"
				:"El area es de:"+ Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3)));
		
		teclado.close();
	}

}


