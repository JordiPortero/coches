package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class OrdenarCoches {

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


        List<Coche>cocheList=new ArrayList<>();

        cocheList.add(coche1);
        cocheList.add(coche2);
        cocheList.add(coche3);
        cocheList.add(coche4);
        cocheList.add(coche5);

        for (Coche coche:cocheList)
        {
            System.out.println(coche);
        }

        Collections.sort(cocheList);

        System.out.println("Coches ordenados por matrícula: ");

        for (Coche coche:cocheList)
        {
            System.out.println(coche);
        }





    }
}
