package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by professor on 29/06/2016.
 */
public class CocheSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        generarCoches();
        // System.out.println(mapNombre.get("Laura"));
        //consultarCoches();
    }


    public static void generarCoches(){

        Coche coche1 = new Coche(1L, "Renault", "once", 1993, "4526BNN");
        Coche coche2 = new Coche(2L, "Skoda", "pio", 2009, "4258HFG");
        Coche coche3 = new Coche(3L, "Fiat", "alpaca", 2013, "0521FGH");
        Coche coche4 = new Coche(4L, "Toyota", "corolla", 2015, "1251SHH");
        Coche coche5 = new Coche(5L, "Nissan", "qashqai", 1999, "5361TEJ");


        TreeSet ts = new TreeSet(new CocheComparatorByYear());
        //TreeSet que usa el comparador por año e vez del compare to natural(por matricula).
        System.out.println("Insertando coche 1 en el TreeSet: ");
        ts.add(coche1);
        System.out.println("Insertando coche 2 en el TreeSet: ");
        ts.add(coche2);
        System.out.println("Insertando coche 3 en el TreeSet: ");
        ts.add(coche3);
        System.out.println("Insertando coche 4 en el TreeSet: ");
        ts.add(coche4);
        System.out.println("Insertando coche 5 en el TreeSet: ");
        ts.add(coche5);
        System.out.println("Coches ordenados por matricula: ");
        System.out.println(ts);

    }
}
