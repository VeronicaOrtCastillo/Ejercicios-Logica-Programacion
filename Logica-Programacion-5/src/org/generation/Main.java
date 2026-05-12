package org.generation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // ====== SE CREA EL DICCIONARIO ======
        //Utilizar un objeto HashMap para almacenar los pares de palabras.
        HashMap<String, String> diccionario = new HashMap<>();

        // ====== SE AGREGAN LAS PALABRAS ======
        //Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
        diccionario.put("perro","dog");
        diccionario.put("gato","cat");
        diccionario.put("pajaro","bird");
        diccionario.put("pez","fish");
        diccionario.put("tortuga","turtle");
        diccionario.put("pato","duck");
        diccionario.put("oveja","sheep");
        diccionario.put("caballo","horse");
        diccionario.put("conejo","rabbit");
        diccionario.put("gallina","hen");
        diccionario.put("manzana","apple");
        diccionario.put("naranja","orange");
        diccionario.put("fresa","strawberry");
        diccionario.put("uva","grape");
        diccionario.put("sandia","watermelon");
        diccionario.put("mango","mango");
        diccionario.put("pera","pear");
        diccionario.put("durazno","peach");
        diccionario.put("limon","lemon");
        diccionario.put("cereza","cherry");

        // ====== SE CREA EL SCANNER ======
        Scanner scanner = new Scanner(System.in);

        //variable para respuestas correctas
        int correctas = 0 ;
        //variable para respuestas incorrectas
        int incorrectas = 0 ;

        // ====== SE OBTIENEN LAS PALABRAS DEL HASMAP ======
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());

        //Collections mezcla aleatoriamente las palabras
        Collections.shuffle(palabras);

        //Ciclo for que se ejecutara 5 veces
        //Escoger al azar 5 palabras en español del mini diccionario
        for (int i = 0; i < 5; i++) {
            //obtiene la palabraen español
            String palabraEspanol = palabras.get(i);
            //obtiene traduccion correcta
            String traduccionCorrecta = diccionario.get(palabraEspanol);

            //muestra la palabra al usuario
            //Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son
            //correctas.
            System.out.println("Traduce la palabra: " + palabraEspanol);
            //guarda la respuesta del usuario
            String respuestaUsuario = scanner.nextLine();

            // ====== COMPARAR RESPUESTAS ======
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {

                System.out.println("Correcto");
                correctas++;

            } else {

                System.out.println("Incorrecto");
                System.out.println("La respuesta correcta es: " + traduccionCorrecta);

                incorrectas++;
            }
            System.out.println();
        }

        // ====== MUESTRA RESULTADOS FINALES ======
        //Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario
        System.out.println("===== RESULTADOS =====");
        System.out.println("Respuestas Correctas: " + correctas);
        System.out.println("Respuestas Incorrectas: " + incorrectas);

        //se cierra el scanner
        scanner.close();
    }
}
