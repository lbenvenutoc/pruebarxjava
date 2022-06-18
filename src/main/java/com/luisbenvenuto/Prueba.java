package com.luisbenvenuto;

import io.reactivex.Observable;

public class Prueba {

    public static void main(String[] args) {
        hello();
        /*System.out.println(new Calculadora() {
            @Override
            public Integer suma(Integer numero1, Integer numero2) {
                return numero1 + numero2;
            }
        }.suma(4,2));
        */

        //Calculadora calculadora = (Integer numero1, Integer numero2) -> numero1+numero2;
        //System.out.println(calculadora.suma(4,2));


    }

    public static void hello() {
        Observable.just("Hello, World!") // create new observable
                .subscribe(onNext -> { // subscribe and perform action
                    System.out.println(onNext);
                });
    }
}
