/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
import entities.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        Operacion op1 = new Suma();
        double r1 = op1.calcular(5, 3);
        ((Mostrable)op1).mostrar(r1);
        ((Registrable)op1).registrar(5, 3, r1);

        System.out.println();

        Operacion op2 = new Resta();
        double r2 = op2.calcular(10, 4);
        ((Mostrable)op2).mostrar(r2);
        ((Registrable)op2).registrar(10, 4, r2);

        System.out.println();

        Operacion op3 = new Multiplicacion();
        double r3 = op3.calcular(6, 7);
        ((Mostrable)op3).mostrar(r3);
        ((Registrable)op3).registrar(6, 7, r3);
    }
}

