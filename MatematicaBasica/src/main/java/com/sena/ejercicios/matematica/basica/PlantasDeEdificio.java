/*PROBLEMA 6:
Después de subir 6 pisos el ascensor de un edificio llega al piso 5.
¿De qué planta ha salido?
*/

package com.sena.ejercicios.matematica.basica;

import java.util.Scanner;

public class PlantasDeEdificio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el número de pisos subidos: ");
    int pisosSubidos = Integer.parseInt(scanner.nextLine());
    System.out.println("Ingrese la plantas del edificio a la que ha llegado: ");
    int numPlanta = Integer.parseInt(scanner.nextLine());

    int resta = numPlanta - pisosSubidos;

    System.out.println("Ha salido de la planta No. " + resta);
  }
}
