package org.iesvdm.functioninterfacebydefault;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PruebaInterfaces {

    public static void main(String[] args) {

        Supplier<Integer> sup = () -> (int) (Math.random()*100);
        System.out.println("Número Aleatorio con Lambdas: " + sup.get());

        Function<String, Integer> longCad = (s) -> s.length();
        System.out.println("longCad = " + longCad.apply("123"));

        UnaryOperator<String> grita = (s) -> s.toUpperCase() + "!";

        Function<String, String> gritaMasEnojado = (s) -> {
            String aux = "@#€$%" + s.toUpperCase();
            return aux + "!";
        };

        System.out.println("grita = " + grita.apply("dani"));
        System.out.println("gritaMasEnojado = " + gritaMasEnojado.apply("dani"));


    }

}
