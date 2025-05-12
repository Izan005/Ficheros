package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Ejercicio6 {
    public static void main(String[] args) {
        ejercicio6();
    }

    public static void ejercicio6() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));

            String linea;
            String palabra = "Lorem";
            int cont = 0;
            String palabras[];

            while((linea = lector.readLine()) != null) {
                palabras = linea.split(" ");
                for (String p : palabras) {
                    if (p.equals(palabra)){
                        cont++;
                    }
                }
            }

            System.out.println("La palabra " + palabra + " aparece " + cont + " veces.");
        } catch (IOException e){
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);
        }
    }

    public static void prueba(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
            String linea;

            while((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        }catch (IOException e) {
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);
        }
    }
}
