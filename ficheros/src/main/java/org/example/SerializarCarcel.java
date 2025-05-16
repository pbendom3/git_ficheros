package org.example;

import java.io.*;

public class SerializarCarcel {

    public static void main(String[] args) {

        Carcel rosario_peru = new Carcel(1000,"Rosario - Perú",20000);

        //SERIALIZAR
        try {
            ObjectOutputStream fichero_seri = new ObjectOutputStream(new FileOutputStream("src/main/resources/carcel.ser"));
            fichero_seri.writeObject(rosario_peru);
            fichero_seri.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

        //DESERIALIZAR
        try {
            ObjectInputStream obtener_objeto = new ObjectInputStream(new FileInputStream("src/main/resources/carcel.ser"));
            Carcel carcel_leida = (Carcel) obtener_objeto.readObject();
            System.out.println("Número de celdas: " + carcel_leida.getCeldas() + " Nombre del penitenciario: " + carcel_leida.getNombre() + " Número de presos: " + carcel_leida.getNum_presos());
            System.out.println(carcel_leida);
            obtener_objeto.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

    }
}
