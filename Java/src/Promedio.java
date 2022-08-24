import java.util.Scanner;

public class Promedio {
    static Scanner save = new Scanner(System.in);

    public static void main (String [] args) {
        double calificacion1, calificacion2, calificacion3, calificacion4;
        double promedio;


        System.out.println("Ingrese la primera calificacion");
        calificacion1= save.nextDouble();

        System.out.println("Ingrese la segunda calificacion");
        calificacion2= save.nextDouble();

        System.out.println("Ingrese la tercer calificacion");
        calificacion3= save.nextDouble();

        System.out.println("Ingrese la cuarta calificacion");
        calificacion4= save.nextDouble();

        promedio= (calificacion1+calificacion2+calificacion3+calificacion4)/4;

        System.out.println("Tus calificaciones por unidad son: " +calificacion1+" " +calificacion2+" "+calificacion3+" "+calificacion4);
        System.out.println("El promedio final es: "+promedio);
    }
}