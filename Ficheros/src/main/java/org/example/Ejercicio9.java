package org.example;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            File archivo = new File("src/main/resources/nombre0.txt");
            File archivoTemp = new File("src/main/resources/nombre0temp.txt");

            if (archivoTemp.createNewFile()){
                System.out.println("Archivo temporal creado.");
            } else {
                System.out.println("El archivo temporal ya existe.");
            }

            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemp));

            String linea;
            String linea_final = "";
            String palabras[];

            while ((linea = reader.readLine()) != null){
                palabras = linea.split(" ");
                for (String p : palabras){
                    String palabra[] = p.split("");
                    for (int i = 0; i < palabra.length; i++) {
                        if (i == 0){
                            linea_final = linea_final + palabra[i].toUpperCase();
                        } else if (i == palabra.length - 1){
                            linea_final = linea_final + palabra[i] + " ";
                        } else {
                            linea_final = linea_final + palabra[i];
                        }
                    }
                    System.out.println(linea_final);
                }

                writer.write(linea_final);
            }

            if (archivo.delete()){
                archivoTemp.renameTo(archivo);
                System.out.println("Archivo modificado correctamente");
            } else {
                System.out.println("No se ha podido reemplazar el archivo original");
            }

            reader.close();
            writer.close();



        }catch (IOException e) {
            e.getStackTrace();
        }
    }
}
