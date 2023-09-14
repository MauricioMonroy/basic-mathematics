/*PROBLEMA 5:
Un comerciante tiene 120 kilos de café. Ha envasado 40 bolsas de 1/2de kilo cada una,
28 bolsas de 3/4 de kilo cada una y 20 bolsas de 3/2 de kilo cada una.
Calcula el número de kilos de café que le quedan todavía por envasar.
*/

package com.sena.ejercicios.matematica.basica;

import com.sena.clases.operaciones.Fraccion;
import java.util.Scanner;

public class CafeEnvasado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Cantidad de cafe a envasar (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion totalCafe = new Fraccion(scanner.nextInt(), scanner.nextInt());
    
    System.out.println(
        "Cantidad de bolsas A (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion numeroBolsasA = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Capacidad de las bolsas A (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion capacidadBolsasA = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Cantidad de bolsas B (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion numeroBolsasB = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Capacidad de las bolsas B (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion capacidadBolsasB = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Cantidad de bolsas C (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion numeroBolsasC = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Capacidad de las bolsas C (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion capacidadBolsasC = new Fraccion(scanner.nextInt(), scanner.nextInt());

    Fraccion producto = numeroBolsasA.multiplicar(capacidadBolsasA);
    Fraccion producto2 = numeroBolsasB.multiplicar(capacidadBolsasB);
    Fraccion producto3 = numeroBolsasC.multiplicar(capacidadBolsasC);

    Fraccion suma = producto.sumar(producto2).sumar(producto3);
    Fraccion restaTotal = totalCafe.restar(suma);

    System.out.println(
        "Las bolsas A contienen un total de "
            + producto
            + " Kilos"
            + "; las bolsas B contienen "
            + producto2
            + " Kilos"
            + "; las bolsas C contienen "
            + producto3
            + " Kilos");
    System.out.println(
        "Se ha envasado un total de "
            + suma
            + " kilos. Por lo tanto, queda por envasar un total de "
            + restaTotal
            + " Kilos");
  }
}
