package org.example;

import java.io.File;
import java.sql.SQLOutput;

public class Ejercicio5 {
    public static void main(String[] args) {
        String carpeta = "src/main/resources";
        ejercicio5(carpeta);
    }

    public static void ejercicio5(String ruta_carpeta){
        File carpeta = new File(ruta_carpeta);

        if (carpeta.isDirectory()){
            File archivos[] = carpeta.listFiles();
            if (archivos != null){
                for (File f : archivos){
                    if (f.isFile() && f.getName().contains(".txt")){
                        System.out.println(f.getName());
                    }
                }
            } else {
                System.out.println("La carpeta está vacía");
            }
        } else {
            System.out.println(carpeta.getName() + " no es un directorio.");
        }
    }

    /**
     * Mostrar todos los archivos del directorio raíz del proyecto
     */
    public static void prueba1(){
        File directorios = new File(".");

        String archivos[] = directorios.list();

        if (archivos != null && archivos.length > 0) {
            for (String a : archivos) {
                System.out.println(a);
            }
        } else {
            System.out.println("No hay archivos en la carpeta.");
        }
    }

    /**
     * Mostrar los nombres e información de todos los archivos del directorio raíz del proyecto
     */
    public static void prueba2(String ruta){
        File carpeta = new File(ruta);
        if (carpeta.isDirectory()){
            File archivos[] = carpeta.listFiles();
            if (archivos != null && archivos.length > 0) {
                for (File f : archivos) {
                    if (f.isFile()) {
                        System.out.println(f.getName() + " - " + f.length() + " bytes." );
                    }
                }
            } else {
                System.out.println("No se ha encontrado ningún archivo");
            }
        } else {
            System.err.println("La ruta proporcionada no es una carpeta.");
        }
    }
}
