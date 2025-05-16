package org.example;

import java.io.*;

public class Binarios {

    public static void main(String[] args) {

        // ESCRIBIR FICHERO BINARIO
        // DataOutputStream - escribir
        // DataInputStream - leer ficheros binarios

        //FileOutputStream
        // FileIntputStream

        try {
            DataOutputStream fichero_binario = new DataOutputStream(new FileOutputStream("C:/Users/1dam/git_ficheros/ficheros/src/main/resources/binario.bin"));
            fichero_binario.writeBoolean(true);
            fichero_binario.writeDouble(3.141515);
            fichero_binario.writeInt(10);
            fichero_binario.writeUTF("Hola");
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        // LEER FICHERO BINARIO - conociendo su estructura
        try {
            DataInputStream leido = new DataInputStream(new FileInputStream("C:/Users/1dam/git_ficheros/ficheros/src/main/resources/binario.bin"));
//            fichero_binario.writeBoolean(true);
//            fichero_binario.writeDouble(3.141515);
//            fichero_binario.writeInt(10);
//            fichero_binario.writeUTF("Hola");
            boolean valor_booleano = leido.readBoolean();
            double pi = leido.readDouble();
            int num = leido.readInt();
            String caracteres = leido.readUTF();
            System.out.println(valor_booleano + " " + pi + " " + num + " " + caracteres);
            leido.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

        // LEER FICHERO BINARIO - sin conocer su estructura
        try {
            FileInputStream ficherito = new FileInputStream("C:/Users/1dam/git_ficheros/ficheros/src/main/resources/binario.bin");
            int byteaprocesar;

            while ((byteaprocesar = ficherito.read()) != -1){
                System.out.print((char) byteaprocesar + " ");
            }

            ficherito.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }


    }

}
