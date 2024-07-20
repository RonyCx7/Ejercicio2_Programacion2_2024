package umg.progra2.Grupo1;
import java.util.Scanner;

public class clsAreaCirculo {
    Scanner sc = new Scanner(System.in);

    Float area;
    public void AreaCirculo (float radio){

        area = (float) ((radio * radio)*3.1416);
        System.out.println(area);

    }
}
