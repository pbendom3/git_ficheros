package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@ToString
public class Carcel implements Serializable {

    private int celdas;
    private transient String nombre;
    private int num_presos;

}
