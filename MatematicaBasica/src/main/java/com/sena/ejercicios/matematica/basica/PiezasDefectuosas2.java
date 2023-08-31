/*PROBLEMA 14:
El porcentaje de piezas defectuosas de una máquina es de 5%,
si la máquina produce 2500 piezas ¿Cuántas de ellas saldrán defectuosas?
*/
package com.sena.ejercicios.matematica.basica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PiezasDefectuosas2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese el porcentaje de piezas defectusas:");
    float porcentajePiezas = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese la cantidad de piezas que produce la máquina:");
    float piezasProducidas = Float.parseFloat(scanner.nextLine());

    float piezasDefectuosas = (piezasProducidas * porcentajePiezas) / 100;

    System.out.println("Saldran " + df.format(piezasDefectuosas) + " piezas defectuosas");
  }
}
