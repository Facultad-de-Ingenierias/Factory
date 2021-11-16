/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory.Autos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richa
 */
public class FabricaAutos {

    List<Auto> autos = new ArrayList();

    public void fabricarAuto(String tipo, String placa, String color, String marca) {
        switch (tipo) {
            case "trabajo":
                autos.add(new AutoDeTrabajo(placa, color, marca));
            case "deportivo":
                autos.add(new AutoDeportivo(placa, color, marca));
            case "autobus":
                autos.add(new Autobus(placa, color, marca));
            default:
                break;
        }
    }

    public void mostrarAutos() {
        autos.forEach(auto -> {
            System.out.println(auto);
        });
    }
}
