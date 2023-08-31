/*PROBLEMA 4:
En un concurso de dibujo se presentaron 90 participantes;
1/18 de los participantes obtuvieron como premio una bicicleta;
1/9 de los participantes obtuvieron como premio un juego,
y el resto de los participantes obtuvieron un premio en efectivo.
Calcula cuántos participantes obtuvieron el premio en efectivo.
*/
package com.sena.ejercicios.matematica.basica;

import com.sena.clases.operaciones.Fraccion;
import java.util.Scanner;

public class PremioConcurso {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Cantidad de participantes (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion participantes = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Participantes que ganaron una bicicleta (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion premioBicicleta = new Fraccion(scanner.nextInt(), scanner.nextInt());

    System.out.println(
        "Participantes que ganaron un juego (1. numerador, 2. presione enter, 3. denominador; si es un entero agregue (1) como denominador):");
    Fraccion premioJuego = new Fraccion(scanner.nextInt(), scanner.nextInt());

    Fraccion producto = participantes.multiplicar(premioBicicleta);
    Fraccion resta = participantes.restar(producto);
    Fraccion producto2 = participantes.multiplicar(premioJuego);
    Fraccion resta2 = participantes.restar(producto2);

    Fraccion restaTotal = resta2.sumar(resta).restar(participantes);

    System.out.print(
        producto + " recibieron una bicicleta y " + producto2 + " recibieron un juego. ");
    System.out.println(
        "Por lo tanto, un total de " + restaTotal + " participantes obtuvieron premio en efectivo");
  }
}
