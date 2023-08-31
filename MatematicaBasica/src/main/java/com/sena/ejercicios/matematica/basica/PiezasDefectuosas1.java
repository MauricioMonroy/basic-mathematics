/*PROBLEMA 13:
En la producción de 120 piezas 5 salen defectuosas,
¿Cuántas piezas saldrán defectuosas en un lote de 500 unidades?
 */

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PiezasDefectuosas1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    System.out.println("Ingrese la cantidad de piezas producidas:");
    float piezasProducidas = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese la cantidad de piezas defectuosas:");
    float piezasDefectousas = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese la cantidad del lote a producir:");
    float lote = Float.parseFloat(scanner.nextLine());

    float porcentaje = (piezasDefectousas / piezasProducidas) * 100;

    float posiblesPiezasDefectuosas = (lote * porcentaje) / 100;

    System.out.println(
        "Saldran " + df.format(posiblesPiezasDefectuosas) + " posibles piezas defectuosas");
  }
}
