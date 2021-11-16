/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

import com.mycompany.factory.Autos.FabricaAutos;

/**
 *
 * @author Richa
 */
public class Main {

    static FabricaAutos fabrica;

    public static void main(String[] args) {
        fabrica = new FabricaAutos();

        fabrica.fabricarAuto("deportivo", "asd", "marron", "tesla");
        fabrica.fabricarAuto("autobus", "ads", "rojo", "masda");
        fabrica.fabricarAuto("trabajo", "dsa", "negro", "nissan");
        
        fabrica.mostrarAutos();
    }
}
