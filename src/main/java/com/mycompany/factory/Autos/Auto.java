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
public class Auto {
    public String placa;
    public String marca;
    public String color;
    public int potencia = 1;
    public String tipo;

    public Auto(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Auto de tipo: "+tipo+" con una potencia de "+potencia+" caballos de fuerza";
    }
}
