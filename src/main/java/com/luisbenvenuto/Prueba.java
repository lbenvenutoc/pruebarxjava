package com.luisbenvenuto;

public class Prueba {

    public static void main(String[] args) {


        Calculadora operacionSuma = (Integer numero1, Integer numero2) -> numero1 + numero2;
        Integer resultado = operacionSuma.oepracion(4, 2);
        if (resultado > 0) {
            System.out.println("Suma: " + resultado);
        }


        Calculadora operacionReesta = (Integer numero1, Integer numero2) -> numero1 - numero2;
        System.out.println("Resta: " + operacionReesta.oepracion(4, 2));


    }


}
