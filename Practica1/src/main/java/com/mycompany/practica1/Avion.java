/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Ignacio
 */
public class Avion extends Vehiculo{
    //Atributos
    private String marca;
    private int año;
    private double tamaño;
    private int numeroMotores;

    //Constructores
    public Avion(String marca, int año, double tamaño, int numeroMotores) {
        super();
        this.marca = marca;
        this.año = año;
        this.tamaño = tamaño;
        this.numeroMotores = numeroMotores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    
    
}
