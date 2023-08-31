/*PROBLEMA 3:
En la estantería A hay 60 botellas de 3/4 de litro cada una
y en la estantería B hay 120 botellas de 1/4 de litro cada una.
Calcula los litros que contienen las botellas de cada estantería.
*/

package com.sena.ejercicios.matematica.basica;

import com.sena.clases.operaciones.Fraccion;
import java.util.Scanner;

public class ContenidoBotellas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Cantidad de botellas estantería A (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion numeroBotellasA = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Litros contenidos en cada botella (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f1 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Cantidad de botellas estantería B (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion numeroBotellasB = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Litros contenidos en cada botella (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f2 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    Fraccion producto = numeroBotellasA.multiplicar(f1);

    Fraccion producto2 = numeroBotellasB.multiplicar(f2);

    Fraccion suma = producto.sumar(producto2);

    System.out.print("En la estantería A hay " + producto + " Litros, mientras que");
    System.out.println(" en la estantería B hay " + producto2 + " Litros");
    System.out.println("La cantidad total en ambas estanterías es de " + suma + " Litros");
  }
}
