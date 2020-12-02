package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {

    private static final String teamName = "Ceiba";

    public static String answer(String question) {
        if ("".equals(question)) {
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher plusMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (plusMatcher.matches()) {
            return String.valueOf(Integer.parseInt(plusMatcher.group(1)) + Integer.parseInt(plusMatcher.group(2)));
        }

        Matcher largestMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
        if (largestMatcher.matches()) {
            return String.valueOf(Integer.parseInt(largestMatcher.group(1)) + Integer.parseInt(largestMatcher.group(2)));
        }

//        Matcher larges1tMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+)").matcher(question);
//        if(larges1tMatcher.matches()){
//            if(larges1tMatcher.group(1) > larges1tMatcher.group(2)){
//
//            }
//            return String.valueOf(Integer.parseInt(larges1tMatcher.group(1)) + Integer.parseInt(larges1tMatcher.group(2)));
//        }

        Matcher larges2tMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (larges2tMatcher.matches()) {
            return Integer.parseInt(larges2tMatcher.group(1)) >
                    Integer.parseInt(larges2tMatcher.group(2)) ? larges2tMatcher.group(1) : larges2tMatcher.group(2);
        }

        Matcher multipledNumbersMatcher = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);

        if (multipledNumbersMatcher.matches()) {
            return String.valueOf(Integer.parseInt(multipledNumbersMatcher.group(1)) * Integer.parseInt(multipledNumbersMatcher.group(2)));
        }

        Matcher menusNumbersMatcher = Pattern.compile(".*what is (\\d+) minus (\\d+)").matcher(question);

        if (menusNumbersMatcher.matches()) {
            return String.valueOf(Integer.parseInt(menusNumbersMatcher.group(1)) - Integer.parseInt(menusNumbersMatcher.group(2)));
        }

        Matcher primesNumbersMatcher = Pattern.compile(".*which of the following numbers are primes: (\\d+), (\\d+)").matcher(question);

        if (primesNumbersMatcher.matches()) {
            if(esPrimo(Integer.parseInt(primesNumbersMatcher.group(1)))){
                return primesNumbersMatcher.group(1);
            }else{
                primesNumbersMatcher.group(2);
            }
        }

        Matcher yelLowMatcher = Pattern.compile(".*what colour is a banana").matcher(question);
        if (yelLowMatcher.matches()) {
            return "yellow";
        }

        Matcher agentMatcher = Pattern.compile(".*who played James Bond in the film Dr No").matcher(question);
        if (agentMatcher.matches()) {
            return "007";
        }

        return teamName;
    }

    /**
     * Indica si un numero es primo
     *
     * @param numero Número que queremos saber si es primo o no
     * @return True = es primo
     */
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }
        int contador = 0;

        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }

}