/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Ignacio
 */
public class Automovil extends Vehiculo {
    //Atributos
    private String marca;
    private int año;
    private String modelo;
    private int tamañoMotor;

    //Constructores
    public Automovil(String marca, int año, String modelo, int tamañoMotor) {
        super();
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.tamañoMotor = tamañoMotor;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamañoMotor() {
        return tamañoMotor;
    }

    public void setTamañoMotor(int tamañoMotor) {
        this.tamañoMotor = tamañoMotor;
    }
    
    
}
