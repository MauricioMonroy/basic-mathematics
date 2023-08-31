/*PROBLEMA 11:
La aleación de un material contiene 5% de Cobre,
en 4250 gramos ¿cuántos gramos de Cu hay en dicha aleación?
 */

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;

public class PorcentajeDeAleacion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el porcentaje de cobre que hay en la aleación: ");
    double cantidadDeCobre = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese el total de gramos de la aleación: ");
    double totalGramos = Double.parseDouble(scanner.nextLine());

    double gramosCobre = (totalGramos * cantidadDeCobre) / 100;

    System.out.println("Hay un total de " + gramosCobre + " gramos de cobre en la aleación");
  }
}
