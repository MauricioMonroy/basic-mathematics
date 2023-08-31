/*PROBLEMA 2:
Un depósito estaba lleno de agua. Primero, se sacaron 5/8 de su contenido
y después se sacó 1/6 del agua que quedó en el depósito.
Calcula los litros de agua que quedaron en el depósito, si el depósito contenía 120
litros de agua
*/

package com.sena.ejercicios.matematica.basica;

import com.sena.clases.operaciones.Fraccion;
import java.util.Scanner;

public class DepositoDeAgua {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Cantidad de agua extraída la primera vez (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f1 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Cantidad de agua extraída segunda vez (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion f2 = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Ingrese la cantidad de agua inicial en el depósito (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion litrosAgua = new Fraccion(scanner.nextInt(), scanner.nextInt());

    Fraccion producto = litrosAgua.multiplicar(f1);

    Fraccion resta = litrosAgua.restar(producto);

    Fraccion producto2 = resta.multiplicar(f2);

    Fraccion resta2 = resta.restar(producto2);

    System.out.println("Cantidad restante = " + resta2);
  }
}
