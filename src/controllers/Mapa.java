package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runTreeMap() {
        Map <Integer, String> mapa = new HashMap<>();
        mapa.put(3, "carro");
        mapa.put(6, "bicicleta");
        mapa.put(1, "moto");

        for (Integer key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }
    }

    public void runLinkedHashMap() {
        Map <Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "Juan");
        mapa.put(2, "Pedro");
        mapa.put(3, "Maria");
        mapa.put(4, "Ana");
        mapa.put(5, "Luis");

        for (Integer key : mapa.keySet()) {
            System.out.println("Valor: " + mapa.get(key));
        }
    }

    public void runHashMapObj() {
        Map <Empleado, Integer> mapa = new HashMap<>();
        mapa.put(new Empleado(1, "Juan", "dev"), 1200);
        mapa.put(new Empleado(2, "Juan", "dev"), 1500);
        mapa.put(new Empleado(2, "Pedro", "dev"), 2000);
        mapa.put(new Empleado(1, "Juan", "dev"), 2500);
        mapa.put(new Empleado(3, "Diego", "dev"), 3000);

        for (Empleado empleado : mapa.keySet()) {
            System.out.println("Empleado: " + empleado.getName() + ", Salario: " + mapa.get(empleado));
        }
    }

    public void runTreeMapObj() {
        Map <Empleado, Integer> mapa = new TreeMap<>();
        mapa.put(new Empleado(1, "Juan", "dev"), 1200);
        mapa.put(new Empleado(2, "Juan", "dev"), 2500);
        mapa.put(new Empleado(3, "Pedro", "dev"), 2000);
        mapa.put(new Empleado(1, "Diego", "dev"), 3000);
        mapa.put(new Empleado(1, "Juan", "senior"), 1200);

        for (Empleado empleado : mapa.keySet()) {
            System.out.println("Id: " + empleado.getId() + " Empleado: " + empleado.getName() + ", Salario: " + mapa.get(empleado));
        }
    }
}
