/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Practica1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Se crea el usuario
        System.out.println("Ingrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese la cédula del usuario:");
        String cedulaUsuario = scanner.nextLine();
        System.out.println("Ingrese la cantidad de dinero del usuario:");
        double dineroUsuario = 0;
        boolean dineroValido = false;
        while (!dineroValido) {
            try {
                dineroUsuario = Double.parseDouble(scanner.nextLine());
                dineroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un valor numérico para el dinero.");
            }
        }
        
        // Se creaa el usuario con los datos ingresados
        User usuario = new User(nombreUsuario, cedulaUsuario, dineroUsuario);
        
        // Se comprar un vehiculo según la cantidad de dinero del usuario
        
        Caballo caballo = null;
        Automovil automovil = null;
        Avion avion = null;
        if (dineroUsuario >= 50000) {
            avion = new Avion("Boing", 2022, 33, 4);
            usuario.comprarVehiculo(avion);
            System.out.println("Avion comprado: Marca: " + avion.getMarca() +
            ", Año: " + avion.getAño() +
            ", Tamaño: " + avion.getTamaño() +
            ", Número de motores: " + avion.getNumeroMotores());
            usuario.manejar();
        } else if (dineroUsuario >= 2000 && dineroUsuario < 50000){
            automovil = new Automovil("Daihatsu", 1997, "1200", 1200);
            usuario.comprarVehiculo(automovil);
              System.out.println("Automóvil comprado: Marca: " + automovil.getMarca() +
            ", Año: " + automovil.getAño() +
            ", Modelo: " + automovil.getModelo() +
            ", Tamaño del motor: " + automovil.getTamañoMotor());
            usuario.manejarAutomovil();
        } else if (dineroUsuario >= 500 && dineroUsuario < 2000){
            caballo = new Caballo("Poni", 10, 5);
            usuario.comprarVehiculo(caballo);
            System.out.println("Caballo comprado: Raza: " + caballo.getRaza() +
            ", Edad: " + caballo.getEdad() +
            ", Nivel de hambre: " + caballo.getNivelHambre());
            usuario.manejar();
        }
    }
}