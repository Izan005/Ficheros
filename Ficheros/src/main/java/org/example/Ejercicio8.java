package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio8();
    }

    private static void ejercicio8() {
        System.out.println("Introduce número de archivos a crear:");
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {

            try {
                File archivo = new File("src/main/resources/nombre" + i + ".txt");

                if (archivo.createNewFile()){
                    System.out.println("Archivo " + archivo.getName() + " creado con éxito.");
                    BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/resources/nombre" + i + ".txt"));
                    escritor.write("Este es el fichero " + archivo.getName() + ".");
                    escritor.close();
                }else {
                    System.out.println("El archivo " + archivo.getName() + " ya existe.");
                }


            } catch (IOException e ) {
                e.printStackTrace();
            }

        }
    }

    public static void pruebas(){
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/resources/prueba_escribir.txt"));
            escritor.write("Hola");
            escritor.newLine();
            escritor.write("Esto se guarda en el archivo.");

            escritor.close();

        }catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }
    }
}
