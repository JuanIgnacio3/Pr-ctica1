/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Ignacio
 */
public class Caballo extends Vehiculo {
    //Atributos
    private String raza;
    private int edad;
    private int nivelHambre;

    //Constructores
    public Caballo(String raza, int edad, int nivelHambre) {
        super();
        this.raza = raza;
        this.edad = edad;
        this.nivelHambre = nivelHambre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }
    
    
    
}

