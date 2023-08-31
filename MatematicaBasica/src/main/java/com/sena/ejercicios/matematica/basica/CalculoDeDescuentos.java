/*
Calcule el porcentaje de descuento de un artículo cuyo precio era 145.000 pesos,
pero solo se pagaron 127.000 pesos
 */

package com.sena.ejercicios.matematica.basica;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculoDeDescuentos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    NumberFormat porc = NumberFormat.getPercentInstance();

    System.out.println("Ingrese el precio original del artículo:");
    float precioOriginal = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese el precio pagado por el artículo:");
    float precioConDescuento = Float.parseFloat(scanner.nextLine());

    float calculoPorcentaje = ((precioOriginal - precioConDescuento) / precioOriginal) * 1000;

    System.out.println("Se ha efectuado un " + porc.format(calculoPorcentaje) + " de descuento");
  }
}
