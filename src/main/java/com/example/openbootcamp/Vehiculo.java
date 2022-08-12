package com.example.openbootcamp;

public class Vehiculo {

    public static void main(String[] args) {
        PuertasVehiculo mipuertas = new PuertasVehiculo();
        mipuertas.incrementarPuertas();
        System.out.println(mipuertas.puertas);

    }
    static class PuertasVehiculo {
        public int puertas = 2;

        public void incrementarPuertas(){
            puertas++;
        }
    }
}
