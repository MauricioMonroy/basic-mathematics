/*PROBLEMA 16:
Calcule el precio final de un artículo que tiene un descuento del 15%,
si su precio es de 85.000 pesos
*/

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecioConDescuento {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese el precio original del artículo:");
    float precioOriginal = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese el porcentaje de descuento:");
    float porcentajeDescuento = Float.parseFloat(scanner.nextLine());

    float precioFinal = precioOriginal - ((precioOriginal * porcentajeDescuento) / 100);

    System.out.println("El precio con descuento es de " + df.format(precioFinal) + " pesos");
  }
}
