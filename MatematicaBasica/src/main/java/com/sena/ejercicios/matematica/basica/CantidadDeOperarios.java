/*PROBLEMA 12:
Para sacar el pedido de un cliente 25 operarios se demoran un mes
¿Cuántos operarios hay que aumentar para sacar el pedido en 15 días?
 */

package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CantidadDeOperarios {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese la cantidad de operarios:");
    double cantidadOperarios = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese el tiempo que tardan en sacar el pedido (en días):");
    double tiempoTrabajo = Double.parseDouble(scanner.nextLine());

    System.out.println("Ingrese el tiempo que requerido para sacar el pedido (en días):");
    double tiempoRequerido = Double.parseDouble(scanner.nextLine());

    double operariosRequeridos = (cantidadOperarios * tiempoTrabajo) / tiempoRequerido;
    double operariosAdicionales = operariosRequeridos - cantidadOperarios;

    System.out.println(
        "Se debe contratar "
            + df.format(operariosAdicionales)
            + " operarios más para sacar el pedido en los días requeridos");
  }
}
