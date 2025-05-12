package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        ejercicio7();
    }

    private static void ejercicio7() {

        try {
            File archivo = new File("src/main/resources/datos_personas.txt");
            Scanner scanner = new Scanner(archivo);

            String palabra = "Lucía";
            int cont = 0;
            while(scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String palabras[] = linea.split(",");

                for (String p : palabras) {
                    if (p.equals(palabra)){
                        cont++;
                    }
                }
            }

            System.out.println("Se han encontrado " + cont + " repeticiones de la palabra " + palabra);

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }

    public static void prueba2(){

        try {
            File archivo = new File("src/main/resources/datos_personas.txt");
            Scanner scanner = new Scanner(archivo);

            while(scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String palabras[] = linea.split(",");
                String nombre = palabras[0];
                String edad = palabras[1];
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }

    public static void prueba(){
        try {
            File archivo = new File("src/main/resources/datos_personas.txt");
            Scanner scanner = new Scanner(archivo);

            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println("Línea: " + linea);
            }

            scanner.close();//Siempre hay que cerrar los lectores de texto
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }
}
