package com.luisbenvenuto;

public class Prueba {

    public static void main(String[] args) {

        Calculadora calculadora = (Integer numero1, Integer numero2) -> numero1 + numero2;
        Integer resultado = calculadora.suma(4, 2);
        if (resultado > 0) {
            System.out.println("Suma: " + resultado);
        }


    }


}
