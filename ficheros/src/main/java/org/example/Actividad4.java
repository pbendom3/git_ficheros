package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos archivos quieres crear?: ");
        int num = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿En qué carpeta los quieres crear?");
        String carpeta = teclado.next();

        File validar_carpeta = new File(carpeta);

        if (validar_carpeta.exists()){
            for (int i=1;i<=num;i++){

                File fichero = new File(carpeta + "/nombre(" + i +").txt");

                try {
                    fichero.createNewFile();
                    System.out.println("Fichero " + fichero.getName() +  " creado.");
                } catch (IOException e) {
                    System.out.println("Algo ha ido mal.");
                    e.printStackTrace();
                }

            }

        }else{
            System.out.println("El directorio no existe. Escríbelo bien!!");
        }

    }

}
