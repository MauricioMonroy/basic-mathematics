/*PROBLEMA 9:
Si 1 metro de cable al por mayor sale a 658.50 pesos, ¿cuánto cuestan 10.5 m?
*/

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;

public class CostoCable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el costo del metro de cable al por mayor: ");
    float valorMetro = Float.parseFloat(scanner.nextLine());
    System.out.println("Ingrese la cantidad de metros a comprar: ");
    float metrosCable = Float.parseFloat(scanner.nextLine());

    float producto = valorMetro * metrosCable;

    System.out.println("El costo total es de " + producto + " Pesos");
  }
}
