/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Miguel
 */
public class vectores_leer_archivo_csv {

    public static String[] vector1;
    public static String[] vector2;
    public static int[] vector3;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        muestraContenido("datoscsv.csv");
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        vector1 = new String[5];
        vector2 = new String[5];
        vector3 = new int[6];

        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            if (vector1.length <= 5) {
                vector1 = cadena.split(";");
            } else {
                vector2 = cadena.split(";");
            }

        }

        //Sumar vectores
        for (int i = 0; i <= 5; i++) {
            vector3[i] = Integer.parseInt(vector1[i]) + Integer.parseInt(vector2[i]);
        }

        //Imprimir Vectores
        /*
        System.out.print("Vector 1 \n");
		for(int i=0;i<=5;i++) {            
			System.out.print(vector1[i] + " ");
        }
		
		System.out.print("\nVector 2 \n");
		for(int i=0;i<=5;i++) {            
			System.out.print(vector2[i] + " ");
        }
		
		System.out.print("\nVector 3 Suma \n");
		for(int i=0;i<=5;i++) {            
			System.out.print(vector3[i] + " ");
        }*/
        String ruta = archivo;
        File file = new File(ruta);
        BufferedWriter bw;

        if (file.exists()) {
            bw = new BufferedWriter(new FileWriter(file));

            for (int i = 0; i <= 5; i++) {
                if (i == 5) {
                    bw.write(vector1[i]);
                } else {
                    bw.write(vector1[i] + ";");
                }
            }

            bw.newLine();

            for (int i = 0; i <= 5; i++) {
                if (i == 5) {
                    bw.write(vector2[i]);
                } else {
                    bw.write(vector2[i] + ";");
                }
            }

            bw.newLine();
            bw.newLine();

            for (int i = 0; i <= 5; i++) {
                if (i == 5) {
                    bw.write(String.valueOf(vector3[i]));
                } else {
                    bw.write(vector3[i] + ";");
                }
            }

            System.out.print("Se termino el proceso,\nRevisar el csv guardado en\nla raiz del proyecto.");
            
        } else {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();

        b.close();
    }
}
