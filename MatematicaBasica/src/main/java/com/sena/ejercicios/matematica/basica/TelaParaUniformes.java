/*PROBLEMA 10:
Una empresa dedicada a la venta de uniformes de Colegio utiliza 62 metros de tela para hacer 45
uniformes, ¿cuánta tela se necesitará para confeccionar 80 uniformes?
 */

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TelaParaUniformes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("Ingresar la cantidad de metros de tela: ");
    float metrosTela = Float.parseFloat(scanner.nextLine());
    System.out.println("Ingresar los uniformes confeccionados con esta cantidad de tela: ");
    float uniformesConfeccionados = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingresar la cantidad de uniformes que se necesitan: ");
    int uniformesPorConfeccionar = Integer.parseInt(scanner.nextLine());

    float telaNecesaria = (uniformesPorConfeccionar * metrosTela) / uniformesConfeccionados;

    System.out.println("Cantidad de tela necesaria: " + df.format(telaNecesaria) + " metros");
  }
}
