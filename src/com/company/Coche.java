package com.company;

import java.util.Comparator;

/**
 * Created by professor on 29/06/2016.
 */
public class Coche implements Comparable<Coche>{

    private Long id;
    private String marca;
    private String modelo;
    public Integer año;
    private String matricula;


    public Coche(Long id, String marca, String modelo, Integer año, String matricula){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.matricula=matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", matricula='" + matricula + '\'' +
                '}'+ System.lineSeparator();
    }

    public int compareTo(Coche otroCoche){
        return (this.matricula.compareTo(otroCoche.matricula));

    }
}

class CocheComparatorByYear implements Comparator<Coche> {

    @Override
    public int compare(Coche coche, Coche otrocoche) {
        if (coche.getAño() > otrocoche.getAño()) {
            return 1;
        }
        else if(coche.getAño()< otrocoche.getAño()){
            return -1;
        }
        else return  0;
    }
}

