/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Ignacio
 */
abstract class Vehiculo {
    //Atributo
     private double velocidad;

    //Constructor
    public Vehiculo() {
        velocidad = 0;
    }

    //Métodos para aumentar, disminuir y frenar la velocidad
    public void aumentarVelocidad(double incremento) {
        velocidad += incremento;
        System.out.println("Velocidad aumentada en " + incremento + " unidades");
    }

    public void disminuirVelocidad(double decremento) {
        velocidad -= decremento;
        System.out.println("Velocidad disminuida en " + decremento + " unidades");
    }

    public void frenar() {
        velocidad = 0;
        System.out.println("Vehículo frenado");
    }

    //Método para encender la alarma y emitir 10 sonidos
    public void encenderAlarma() {
        System.out.println("Alarma encendida");
        for (int i = 0; i < 10; i++) {
            System.out.println("Sonido " + (i + 1));
        }
    }
}