package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio4(){
        System.out.println("Introduce número de archivos a crear:");
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            File archivo = new File("src/main/resources/nombre" + i + ".txt");

            try {
                if (archivo.createNewFile()){
                    System.out.println("Archivo " + archivo.getName() + " creado con éxito.");
                } else {
                    System.out.println("El archivo " + archivo.getName() + " ya existe.");
                }
            } catch (IOException e ) {
                e.printStackTrace();
            }

        }
    }

    public static void prueba(){
        File archivo = new File("nuevoArchivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File directorio = new File("nuevoDirectorio");
        if (directorio.mkdir()) {
            System.out.println("Directorio creado");
        } else {
            System.out.println("El directorio no se pudo crear.");
        }

        File archivoBorrar = new File("archivoParaEliminar.txt");

        if (archivoBorrar.delete()) {
            System.out.println("Archivo eliminado.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}
