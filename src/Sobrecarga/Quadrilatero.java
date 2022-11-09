package Sobrecarga;

public class Quadrilatero {

    public static void area(double lado) {

        double areaQ = lado * lado;

        System.out.println("Área do quadrilatéro é " + areaQ);
    }

    public static void area(double lado1, double lado2) {

        double areaR = lado1 * lado2;

        System.out.println("Área do retângulo é " + areaR);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        double areaT =  ((baseMaior + baseMenor)*altura) / 2;

        System.out.println("Área do Trapézio é " + areaT);


    }







}
