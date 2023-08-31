/*PROBLEMA 20:
Si para imprimir unos folletos 3 impresoras trabajan 2 horas al día durante 10 días.
¿Cuántos días tardarán en hacerlo 2 impresoras 5 horas al día?
 */

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FolletosImpresos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese la cantidad de impresoras:");
    double cantidadImpresoras = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese la cantidad de horas trabajadas en un día:");
    double tiempoHoras = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese la cantidad de días trabajadas:");
    double tiempoDias = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese la nueva cantidad de impresoras:");
    double nuevasImpresoras = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese las horas que trabajarían en un día:");
    double horasRequeridas = Double.parseDouble(scanner.nextLine());

    double tiempoRequerido =
        (cantidadImpresoras * tiempoHoras * (tiempoDias / 24))
            / (nuevasImpresoras * horasRequeridas);

    System.out.println(
        df.format(nuevasImpresoras)
            + " impresoras tardarían "
            + df.format(tiempoRequerido * 24)
            + " días en imprimir la misma cantidad de folletos");
  }
}
