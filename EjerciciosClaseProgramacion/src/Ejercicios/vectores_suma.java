/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class vectores_suma {

    public static int intTamano;
    public static Scanner teclado;
    public static int[] vector1;
    public static int[] vector2;
    public static int[] vector3;
    static Random random = new Random();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        teclado = new Scanner(System.in);

        System.out.print("Ingrese tamaño del vector: ");
        intTamano = teclado.nextInt();

        //Asignar tamaño del vector
        vector1 = new int[intTamano];
        vector2 = new int[intTamano];
        vector3 = new int[intTamano];

        for (int i = 0; i < intTamano; i++) {
            vector1[i] = random.nextInt(30);
            vector2[i] = random.nextInt(30);
        }

        for (int i = 0; i < intTamano; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.print("Vector 1 \n");
        for (int i = 0; i < intTamano; i++) {
            System.out.print(vector1[i] + " ");
        }

        System.out.print("\nVector 2 \n");
        for (int i = 0; i < intTamano; i++) {
            System.out.print(vector2[i] + " ");
        }

        System.out.print("\nVector 3 Suma \n");
        for (int i = 0; i < intTamano; i++) {
            System.out.print(vector3[i] + " ");
        }
    }

}
