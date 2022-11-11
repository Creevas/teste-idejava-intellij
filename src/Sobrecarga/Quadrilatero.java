package Sobrecarga;

public class Quadrilatero {

    public static double area(double lado) {

        double areaQ = lado * lado;

        return areaQ ;
    }

    public static double area(double lado1, double lado2) {

        double areaR = lado1 * lado2;

        return areaR;

    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        double areaT =  ((baseMaior + baseMenor)*altura) / 2;

        return areaT;


    }







}
