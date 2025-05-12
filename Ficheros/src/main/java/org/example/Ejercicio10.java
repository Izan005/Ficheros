package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public static void main(String[] args) {
        ejercicio10();
    }

    private static void ejercicio10(){
        File entrada = new File("entrada.txt");
        File salida = new File("salida.txt");


        try {
            BufferedReader reader_entrada = new BufferedReader(new FileReader(entrada));
            BufferedReader reader_salida = new BufferedReader(new FileReader(salida));

            String linea;
            String lineas_entrada[];
            List<String> palabras_entrada = new ArrayList<>();
            int len_entrada = 0;
            String lineas_salida[];
            List<String> palabras_salida = new ArrayList<>();
            int len_salida = 0;

            String linea_final = "";

            while((linea = reader_entrada.readLine()) != null) {
                lineas_entrada = linea.split(" ");

                for (String p : lineas_entrada){
                    palabras_entrada = List.of(p.split(" "));
                    len_entrada++;
                }
            }

            while((linea = reader_salida.readLine()) != null) {
                lineas_salida = linea.split(" ");

                for (String p : lineas_salida){
                    palabras_salida = List.of(p.split(" "));
                    len_salida++;
                }
            }

            System.out.println(len_entrada + " " + len_salida);

            if (len_entrada >= len_salida){

                for (int i = 0; i < len_entrada; i++) {
                    if (len_salida < i){
                        linea_final = linea_final + palabras_entrada.get(i)  + " " + palabras_salida.get(i) + " ";
                    } else {
                        linea_final = linea_final + palabras_entrada.get(i) + " ";
                    }
                }

            } else {
                for (int i = 0; i < len_salida; i++) {
                    if (len_entrada < i){
                        linea_final = linea_final + palabras_salida.get(i) + " " + palabras_entrada.get(i) + " ";
                    } else {
                        linea_final = linea_final + palabras_salida.get(i) + " ";
                    }
                }
            }

            System.out.println(linea_final);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void prueba(){
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("salida.txt"));

            writer.println("Primera línea con println()");
            writer.flush();
            System.out.println("Primera línea escrita y guardada (flush).");

            writer.printf("Número: %.2f\n", 3.1416);
            writer.println("Otra línea más.");

            writer.close();
            System.out.println("Archivo cerrado.");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
