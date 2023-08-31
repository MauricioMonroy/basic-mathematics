/*PROBLEMA 1:
Un ciclista ha estado corriendo durante tres horas. En la primera hora, ha recorrido los 5/18 de un trayecto; 
en la segunda hora, ha recorrido los 7/25 del trayecto, y en la tercera hora, ha recorrido los 11/45
del trayecto. Calcula la fracción del total del trayecto que ha recorrido en las tres horas.
*/

package com.sena.ejercicios.matematica.basica;

import com.sena.clases.operaciones.Fraccion;
import java.util.Scanner;

public class CalculoTrayecto {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Trayecto recorrido en la primera hora (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f1 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Trayecto recorrido en la segunda hora (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f2 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Trayecto recorrido en la tercera hora (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f3 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    Fraccion suma = f1.sumar(f2).sumar(f3);

    System.out.println("Distancia recorrida/Distancia total (en Km)= " + suma);
  }
}
