/*PROBLEMA 8:
Halla el área de un rectángulo de base 5,7 cm. Y de altura 6,8 cm.
Expresa la solución con un único decimal redondeado.
(recuerde que área de un rectángulo es A = Base * Altura)
 */

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaRectangulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.0");

    System.out.println("Ingrese la longitud de la base del rectángulo en cm: ");
    float base = Float.parseFloat(scanner.nextLine());
    System.out.println("Ingrese la altura en cm: ");
    float altura = Float.parseFloat(scanner.nextLine());

    float producto = base * altura;

    System.out.println("El área del rectángulo es de " + df.format(producto) + "cm\u00B2");
  }
}
