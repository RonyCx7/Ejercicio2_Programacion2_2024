package umg.progra2;
import java.util.Scanner;
import umg.progra2.Grupo1.clsAreaCirculo;


import umg.progra2.Grupo1.clsAreaCirculo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valordecimal;

        System.out.println("Ingrese el radio de su circulo");
        valordecimal = sc.nextFloat();

        clsAreaCirculo cac = new clsAreaCirculo();
        cac.AreaCirculo(valordecimal);



    }
}