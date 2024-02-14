/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Ignacio
 */
public class User {
    //Atributos
    private String nombre;
    private String cedula;
    private double dineroTotal;
    private Vehiculo vehiculo;

    //Constructores
    public User(String nombre, String cedula, double dineroTotal) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.dineroTotal = dineroTotal;
    }

    //Método para: comprar un vehículo, manejar el automovil y manejar el vehículo
    public void comprarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        System.out.println("Vehículo comprado: " + vehiculo.getClass().getSimpleName());
    }

    
    public void manejarAutomovil() {
        vehiculo.aumentarVelocidad(50);
        vehiculo.disminuirVelocidad(20);
        vehiculo.frenar();
        vehiculo.encenderAlarma();
    }
    
    
    public void manejar() {
        vehiculo.aumentarVelocidad(50);
        vehiculo.disminuirVelocidad(20);
        vehiculo.frenar();
    }
}