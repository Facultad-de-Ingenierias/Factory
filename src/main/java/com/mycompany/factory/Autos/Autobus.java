/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory.Autos;

/**
 *
 * @author Richa
 */
public class Autobus extends Auto{
    
    public Autobus(String placa, String marca, String color) {
        super(placa, marca, color);
        super.potencia = 100;
        super.tipo = "autobus";
    }
}
