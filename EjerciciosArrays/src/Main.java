import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    /*
    //Ejercicios sobre Arrays en Java
    /*
    1. La NASA está probando sensores de temperatura en las alas de un avión experimental.
    Crea un array de enteros que represente las temperaturas registradas en cada ala. Recorre el
    array y muestra únicamente las temperaturas que superan los 100 grados.
    */
    double[] tempAlaDer = new double[10];
    double[] tempAlaIzq = new double[10];
    for (int i = 0; i < 10; i++) {
      tempAlaDer[i] = elementosRandom(50, 150);
      tempAlaIzq[i] = elementosRandom(50, 150);
    }
    System.out.println("Control temperaturas ala Derecha:");
    for (int i = 0; i < 10; i++) {
      if (tempAlaDer[i] >= 100) {
        System.out.println("Sensor número " + i + " ala izquierda " + tempAlaDer[i] + "grados.");
      }
      System.out.println("Control temperaturas ala Derecha:");
      for (int i = 0; i < 10; i++) {
        if (tempAlaDer[i] >= 100) {
          System.out.println("Sensor número " + i + " ala izquierda " + tempAlaDer[i] + "grados.");
        }
      }
    }
    /*
    2. Un streamer guarda la cantidad de espectadores en cada hora de transmisió n en un array.
    Recorre el array e imprime en qué horas el nú mero de espectadores fue mayor a 1000.
    Ademá s, cuenta cuá ntas veces se superó esa cifra.
    3. Un banco registra en un array los movimientos de una cuenta (positivos ingresos,
    negativos gastos). Recorre el array y calcula el saldo final. Muestra tambié n cuá ntos
    movimientos fueron ingresos y cuá ntos fueron gastos.
    4. Un profesor guarda las notas de 20 alumnos en un array. Recorre el array y determina
    cuá ntos alumnos han aprobado (nota >= 5). Crea una funció n que reciba una nota y
    devuelva si es aprobado o suspenso.
    5. Tienes un array con el tiempo de ejecució n (en milisegundos) de varios algoritmos.
    Recorre el array y encuentra cuá l fue el tiempo má s rá pido y el má s lento.
    6. En un partido de baloncesto, un array almacena los puntos anotados por cada jugador de
    un equipo. Recorre el array y muestra el total de puntos del equipo. Ademá s calcula la media
    de puntos por jugador.
    7. Un saté lite envía un array con niveles de radiació n detectados en distintas ó rbitas.
    Recorre el array y genera un nuevo array solo con los valores superiores a 50. Imprime el
    array resultante.
    8. Convierte el String “La verdad es que estos ejercicios me cuecen" en un array de chars y,
    usando StringBuilder, construye un nuevo String solo con las vocales. Muestra el resultado.
    9. Un nú mero de cuenta bancaria se guarda en un String. Convierte el String a char[],
    recó rrelo y con StringBuilder genera un nuevo String que solo contenga los dígitos pares.
    10. En un array se registran las velocidades de los corredores en una marató n. Recorre el
    array y muestra qué corredores superaron los 20 km/h. Crea una funció n que reciba la
    velocidad y devuelva un mensaje indicando si es 'Rá pido' o 'Normal'.*/

      public static double elementosRandom (double a, double b){
        double numero = 0;
        if (a >= b) {
          System.out.println("\"a\" debe ser menor que \"b\"");
        } else
          numero = a + (b - a) * Math.random();
        return numero;
      }



  }
}