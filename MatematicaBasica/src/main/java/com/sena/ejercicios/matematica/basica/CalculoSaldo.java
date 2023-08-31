/*PROBLEMA 7:
El saldo de una cuenta de un proveedor es 154.000 Pesos,
si le cargan una factura de 313.000 Pesos, ¿cuál es el saldo ahora?
 */

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;

public class CalculoSaldo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el saldo inicial disponible: ");
    int saldoInicial = Integer.parseInt(scanner.nextLine());
    System.out.println("Ingrese el valor de la factura de cobro: ");
    int valorFactura = Integer.parseInt(scanner.nextLine());

    int resta = saldoInicial - valorFactura;

    System.out.println("El nuevo saldo es de " + resta + " Pesos");
  }
}
