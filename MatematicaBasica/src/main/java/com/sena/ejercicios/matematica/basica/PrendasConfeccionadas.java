/*PROBLEMA 19:
Si 6 operarios tardan 3.5 horas en confeccionar 15 prendas,
¿Cuánto tiempo tardan 10 operarios para confeccionar 45 prendas?
 */

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrendasConfeccionadas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese la cantidad de operarios:");
    double cantidadOperarios = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese la cantidad de prendas confeccionadas:");
    double cantidadPrendas = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese el tiempo que tardan:");
    double tiempoTrabajado = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese la nueva cantidad de operarios:");
    double nuevosOperarios = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese las prendas requeridas:");
    double prendasRequeridas = Double.parseDouble(scanner.nextLine());

    double tiempoRequerido =
        (cantidadOperarios * prendasRequeridas * (tiempoTrabajado * 60))
            / (nuevosOperarios * cantidadPrendas);

    System.out.println(
        df.format(nuevosOperarios)
            + " operarios tardarían "
            + (tiempoRequerido / 60)
            + " horas"
            + " en confeccionar "
            + df.format(prendasRequeridas)
            + " prendas");
  }
}
