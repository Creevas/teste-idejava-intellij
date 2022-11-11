package Sobrecarga;

public class Main {

    public static void main (String[] args){

        System.out.println("Exercicio quadriláteros");

        double areaQ = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQ);


        double areaR = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo: " + areaR);


        double areaT = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaT);



    }
}
