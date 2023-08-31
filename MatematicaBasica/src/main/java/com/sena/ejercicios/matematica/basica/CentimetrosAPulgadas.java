/*PROBLEMA 17
Calcule la equivalencia en pulgadas de 17.78 cm. (utilice la equivalencia 1 pulgada = 2.54 cm)
*/

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CentimetrosAPulgadas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("Ingrese la medida en centímetros:");
    float medidaEnCentimetros = Float.parseFloat(scanner.nextLine());

    float pulgada = (float) 2.54;

    float medidaEnPulgadas = medidaEnCentimetros / pulgada;

    System.out.println("Es equivalente a " + df.format(medidaEnPulgadas) + " pulgadas");
  }
}
