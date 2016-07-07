package com.company;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

/**
 * Created by professor on 01/07/2016.
 */
public class CocheMultiMap {//Lista de año, k es integer, i lista de coches
    static ListMultimap<Integer, Coche> cocheMultimap = ArrayListMultimap.create();//buscado en internet poniendo multimap.

    public static void main (String args[]){

        Coche coche1 = new Coche(1L, "Renault", "once", 1993, "4526BNN");
        Coche coche2 = new Coche(2L, "Skoda", "pio", 2009, "4258HFG");
        Coche coche3 = new Coche(3L, "Fiat", "alpaca", 2013, "0521FGH");
        Coche coche4 = new Coche(4L, "Toyota", "corolla", 2013, "1251SHH");
        Coche coche5 = new Coche(5L, "Nissan", "qashqai", 1999, "5361TEJ");

        cocheMultimap.put(1993, coche1);
        cocheMultimap.put(2009, coche2);
        cocheMultimap.put(2013, coche3);
        cocheMultimap.put(2013, coche4);
        cocheMultimap.put(1999, coche5);

        System.out.println("These are the cars made in 1993: "+ System.lineSeparator() + cocheMultimap.get(1993));
        System.out.println("Cars made in 2013: " + System.lineSeparator() + cocheMultimap.get(2013));

    }
}
